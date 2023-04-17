class Task
{
public static void main (String [] args)
{
Task tk = new Task();
tk.task_1();
tk.task_2();
tk.task_3();
tk.task_4();
}

void task_1()
{
int count = 2;
 while(count<=10)
 {
 System.out.print(1 + " ");
 System.out.println(count);
 count =count+2;
 }
}

void task_2()
{
int count = 1;
 while(count<=15)
 {
 System.out.print(1 + " ");
 System.out.println(count);
 count =count+3;
 }
}

void task_3()
{
int count = 3;
 while(count<=15)
 {
 System.out.print(1 + " ");
 System.out.println(count);
 count =count+3;
 }
}

void task_4()
{
int count = 1;
 while(count<=1331)
 {
 System.out.print(1 + " ");
 System.out.println(count);
 count =count*11;
 }
}

}
