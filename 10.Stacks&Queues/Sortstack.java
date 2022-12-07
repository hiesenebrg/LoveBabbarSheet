public class Sortstack {
    public void  insert_correct_position(int x ,Stack<Integer> s ){
        if(s.size()==0 || s.peek()<x){
            s.push(x);
        }else{
            int a  = s.peek();
            s.pop();
            insert_correct_position(x,s);
            s.push(a);
        }
    }
    public void reverse(Stack<Integer> s){
        if(s.size()>0){
            int x = s.peek();
            s.pop();
            reverse(s);
            insert_correct_position(x,s);
        }
    }
	public Stack<Integer> sort(Stack<Integer> s)
	{reverse(s);
	return s;
	} 
}
