/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package legue;
import java.util.*;
/**
 *
 * @author hp
 */
public class Main {

    /**
     * @param args the command line arguments
     */
   static  String Teams[]={"Karamah","Wahdah","Jablah","Tishreen","Hitten","Etihad","Fotwah"};
  static  int[][] Scores={
        {0,1,3,0,3,1,1},
        {1,0,0,0,3,3,1},
        {3,1,0,1,0,0,1},
        {1,1,3,0,0,1,1},
        {1,3,0,0,0,1,3},
        {3,1,0,3,0,0,0},
        {1,0,0,1,0,3,0}
    };


    //النقاط التي لعبها على ارضه
   static int getInLandTeamPoints(int x){
      //نطلب ادخال الفريق المراد حساب نقاطه و يتم البحث على مستوى السطر
        int sum=0;
        for (int j=0;j<7;j++)
            sum+=Scores[x][j];

    return sum;
    }
    //النقاط التي لعبها خارج ارضه
    static int getOutLandTeamPoints(int x){
    //البحث يتم على مستوى العمود لانه خارج ارضه
        int sum=0;
        for (int i=0;i<7;i++)
        {
            if(Scores[i][x]==1&&x!=i)
            sum+=Scores[i][x];
            else if (Scores[i][x]==0&&x!=i)
                sum+=3;
        }


    return sum;
    }
    //مجموع نقاط الفريق
   static int getTeamPoints(int x){
    int sum;
    //مجموع داخل ارضه و خارجه باستدعاء التابعين السابقين
    sum=getInLandTeamPoints(x)+getOutLandTeamPoints(x);
    return sum;
    }
    //الفريق الاول
   static int findFirstTeam(){
        //نبحث عن الفريق الذي يملك اكبر عدد من النقاط باستدعاء التابع السابق
   int max=getTeamPoints(0);
   int k=0;
        for (int i=1;i<7;i++)
        {
            if (getTeamPoints(i)>max)
            {
                max = getTeamPoints(i);
                k=i;
            }
        }
 
   return k;
    }
    //الفريق الذي احرز اكبر عدد من الفوز على ارضه
   static int findInLandWinner(){
     //مصفوفة لتسجيل عدد انتصارات كل فريق
        int k[]={0,0,0,0,0,0,0};
        for (int i=0;i<7;i++){
        for (int j=0;j<7;j++){
        if (Scores[i][j]==3){
        k[i]+=1;
        }
        }
        }
        //البحث عن الانتصارات الاكثر
        int y=0,max=k[0];
        for (int u=1;u<7;u++){
        if (k[u]>max)

        {
            max = k[u];
            y=u;
        }
        }
    return y;
    }
    //الفريق الذي احرز اكثر الانتصارات خارج ارضه
   static int findOutLandWinner(){
    
          int k[]={0,0,0,0,0,0,0};
        for (int i=0;i<7;i++){
        for (int j=0;j<7;j++){
        if (Scores[j][i]==0){
        k[i]+=1;
        }
        }
        }
        int y=0,max=k[0];
        for (int u=1;u<7;u++){
        if (k[u]>max)

        {
            max = k[u];
            y=u;
         }
        }
    return y;

    }
   //ايجاد اكبر عدد من الخسارة على ارضه
   static int findInLandLooser(){
        int k[]={0,0,0,0,0,0,0};
        for (int i=0;i<7;i++){
        for (int j=0;j<7;j++){
        if (Scores[i][j]==0){
        k[i]+=1;
        }
        }
        }
        int y=0,max=k[0];
        for (int u=1;u<7;u++){
        if (k[u]>max)

        {
            max = k[u];
            y=u;
        }
        }
    return y;
    }
   //ايجاد اكبر عدد من الخسارة خارج
   static int findOutLandLooser(){
       int k[]={0,0,0,0,0,0,0};
        for (int i=0;i<7;i++){
        for (int j=0;j<7;j++){
        if (Scores[i][j]==3){
        k[i]+=1;
        }
        }
        }
        int y=0,max=k[0];
        for (int u=1;u<7;u++){
        if (k[u]>max)

        {
            max = k[u];
            y=u;
        }
        }
    return y;
    }
   static void display(){

     //   System.out.println(Teams[0]);
        Scanner input=new Scanner (System.in);
   int s;//يخزن فيها رقم الفريق المدخل لتحقيق بعض التوابع عليه
   int t1;//عدد نقاط فريق ما على ارضه
   int t2;//عدد نقاط فريق ما خارج ارضه
   int t3;//مجموع نقاط فريق ما داخل و خارج ارضه
   int t4;//ايجاد الفريق الحائز على المركز الاول
   int t5;//ايجاد الفريق الحائز على اكثر انتصارات على ارضه
   int t6;//ايجاد الفريق الحائز على اكثر الانتصارات خارج ارضه
   int t7;//ايجاد الفريق الذي نال اكثر خسارات على ارضه
   int t8;//ايجاد الفريق الذي نال اكثر الخسارات خارج ارضه



   System.out.println("Inter the Team's number: ");
    s=input.nextInt();

   t1= getInLandTeamPoints(s);
   t2= getOutLandTeamPoints(s);
   t3= getTeamPoints(s);
   t4= findFirstTeam();
   t5= findInLandWinner();
   t6= findOutLandWinner();
   t7= findInLandLooser();
   t8= findOutLandLooser() ;


   System.out.println("In Land Team Points for "+Teams[s]+" is"+t1+"\n"
           + "Out Land Team Points for "+Teams[s]+" is" +t2+"\n"
           + "TeamPoints for "+Teams[s]+" is"+t3+"\n"
           + "First Team is : "+t4+"  "+Teams[t4]+"\n"
           + "In Land Winner is:"+t5+"  "+Teams[t5]+"\n"
           + "Out Land Winner is : "+t6+"  "+Teams[t6]+"\n"
           + "In Land Looser is :"+t7+"  "+Teams[t7]+"\n"
           + "Out Land Looser is : "+t8+"  "+Teams[t8]+"\n"
           
           );
   

    }
    

    public static  void main(String[] args) {
        // TODO code application logic here
         display();
  



    }

}
