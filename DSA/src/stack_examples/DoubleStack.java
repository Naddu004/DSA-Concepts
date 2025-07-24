package stack_examples;

public class DoubleStack {
    int tos1,tos2,MaxSize,s[];
    void create_stack(int size)
    {
        MaxSize=size;
        tos1=-1;
        tos2=size;
        s=new int[size];
    }
    void push1(int e)
    {
        tos1++;
        s[tos1]=e;
    }
    void push2(int e)
    {
        tos2--;
        s[tos2]=e;
    }
    boolean is_full()
    {
        if(tos1==tos2-1)
            return true;
        else
            return false;
    }

    int pop1()
    {
        int temp=s[tos1];
        tos1--;
        return(temp);
    }
    int pop2()
    {
        int temp=s[tos2];
        tos2++;
        return(temp);
    }
    int peek1()
    {
        return(s[tos1]);
    }
    int peek2()
    {
        return(s[tos2]);
    }
    boolean is_empty1()
    {
        if(tos1==-1)
            return true;
        else
            return false;
    }
    boolean is_empty2()
    {
        if(tos2==MaxSize)
            return true;
        else
            return false;
    }
    void print_stack1()
    {
        for(int i=tos1 ;i>=0;i--)
            System.out.println(s[i]);
    }
    void print_stack2()
    {
        for(int i=tos2 ;i<MaxSize;i++)
            System.out.println(s[i]);
    }
}
