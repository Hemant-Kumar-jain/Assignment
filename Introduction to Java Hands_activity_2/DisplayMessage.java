class DisplayMessage{
  void printMessage(){
   System.out.println("Hello My Message");
}
}

class  MyProgram extends DisplayMessage
  {
    public static void main(String arg[]){
      MyProgram program=new MyProgram();
      program.printMessage();
   }
}
