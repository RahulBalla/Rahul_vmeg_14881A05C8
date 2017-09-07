classGuessingGame{
public int answer;
piblic int min;
public int max;
public GuessingGame(int min,int max){
this.min=min;
this.max=max;
guess();
}
public int guess(){
answer=(min+max)/2;
return 0;
}
public void lower(){
GuessingGame game=new GuessingGame(answer,max);
}
public void upper(){
{
GuessingGame game=new GuessingGame(min,answer);
}
}
