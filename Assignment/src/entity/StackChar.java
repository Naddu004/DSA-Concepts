package entity;

public class StackChar {
    int tos,MaxSize;
    char s[];
    public void createStack(int size)
    {
        MaxSize=size;
        tos=-1;
        s=new char[size];
    }
    public void push(char e)
    {
        tos++;
        s[tos]=e;
    }
    public boolean is_full()
    {
        if(tos==MaxSize-1)
            return true;
        else
            return false;
    }
    public char pop()
    {
        char temp=s[tos];
        tos--;
        return(temp);
    }
    public char peek()
    {
        return(s[tos]);
    }
    public boolean is_empty()
    {
        if(tos==-1)
            return true;
        else
            return false;
    }
    public void print_stack()
    {
        for(int i=tos ;i>=0;i--)
            System.out.print(s[i]);
    }
}
