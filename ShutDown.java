import java.io.*;
public class ShutDown
{
public static void main(String gg[])
{
Runtime runtime=Runtime.getRuntime();
BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the time in seconds after which you want your computer to shutdown ");
long time=Long.parseLong(bufferedReader.readLine());
Process process=runtime.exec("shutdown -s -t "+a);
System.exit(0);

}
}
