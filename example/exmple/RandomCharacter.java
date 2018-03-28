import java.*;
public class RandomCharacter
{public static void main (String qrg[])
{for (int i=1;i<11;i++)
System.out.println(getRandomCharacter());
}
static char getRandomCharacter()
{ char c = (char)((int)'A'+(int)(Math.random()*((int)'Z'-(int)'A'+1)));
if (c=='A'||c=='O'||c=='I'||c=='U')
getRandomCharacter();
return c;
}
}