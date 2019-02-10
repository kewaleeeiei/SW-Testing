package sample;

public class Calculate {
    private float[] ansX = new float[49];
    private float[] ansY = new float[49];



    private float minX,minY,maxX,maxY;
    private int type,count ;

    public Calculate(float minX, float minY, float maxX, float maxY) {
        this.minX = minX;
        this.minY = minY;
        this.maxX = maxX;
        this.maxY = maxY;
        count = 0;
        cal();
//        for (int i = 0 ; i <= 48 ; i++){
//            System.out.println(ansX[i]+","+ansY[i]);
//        }
    }

    public void getAnsX(){
        for(int i=0;i<49;i++){
            System.out.println(ansX[i]);
        }


    }
    public void getAnsY(){
        for(int i=0;i<49;i++){
            System.out.println(ansY[i]);
        }
    }

    public float getAnswerX(int i){
        return ansX[i];
    }


    public float getAnswerY(int i){
        return ansY[i];
    }

    public String pos(int i){
        String answer;
        answer = "("+String.format("%.2f",ansX[i])+","+String.format("%.2f",ansY[i])+")";

        return answer;
    }



    public void cal(){
        topL();
        topM();
        topR();
        middleL();
        center();
        middleR();
        bottomL();
        bottomM();
        bottomR();
    }

    public void topL(){
        //1
        ansX[count]=minX-1;
        ansY[count]=maxY+1;
        count++;
        //2
        ansX[count]=minX;
        ansY[count]=maxY+1;
        count++;
        //3
        ansX[count]=minX+1;
        ansY[count]=maxY+1;
        count++;
        //4
        ansX[count]=minX-1;
        ansY[count]=maxY;
        count++;
        //5
        ansX[count]=minX;
        ansY[count]=maxY;
        count++;
        //6
        ansX[count]=minX+1;
        ansY[count]=maxY;
        count++;
        //7
        ansX[count]=minX-1;
        ansY[count]=maxY-1;
        count++;
        //8
        ansX[count]=minX;
        ansY[count]=maxY-1;
        count++;
        //9
        ansX[count]=minX+1;
        ansY[count]=maxY-1;
        count++;
    }
    public void topM(){
        //10
        ansX[count]=(minX+maxX) /2;
        ansY[count]=maxY+1;
        count++;
        //11
        ansX[count]=(minX+maxX) /2;
        ansY[count]=maxY;
        count++;
        //12
        ansX[count]=(minX+maxX) /2;
        ansY[count]=maxY-1;
        count++;
    }

    public void topR(){
        //13
        ansX[count]=maxX-1;
        ansY[count]=maxY+1;
        count++;
        //14
        ansX[count]=maxX;
        ansY[count]=maxY+1;
        count++;
        //15
        ansX[count]=maxX+1;
        ansY[count]=maxY+1;
        count++;
        //16
        ansX[count]=maxX-1;
        ansY[count]=maxY;
        count++;
        //17
        ansX[count]=maxX;
        ansY[count]=maxY;
        count++;
        //18
        ansX[count]=maxX+1;
        ansY[count]=maxY;
        count++;
        //19
        ansX[count]=maxX-1;
        ansY[count]=maxY-1;
        count++;
        //20
        ansX[count]=maxX;
        ansY[count]=maxY-1;
        count++;
        //21
        ansX[count]=maxX+1;
        ansY[count]=maxY-1;
        count++;
    }

    public void middleL(){
        //22
        ansX[count]=minX-1;
        ansY[count]=(minY+maxY) /2;
        count++;
        //23
        ansX[count]=minX;
        ansY[count]=(minY+maxY) /2;
        count++;
        //24
        ansX[count]=minX+1;
        ansY[count]=(minY+maxY) /2;
        count++;
    }

    public void center(){
        //25
        ansX[count]=(minX+maxX) /2;
        ansY[count]=(minY+maxY) /2;
        count++;

    }
    public void middleR(){
        //26
        ansX[count]=maxX-1;
        ansY[count]=(minY+maxY) /2;
        count++;
        //27
        ansX[count]=maxX;
        ansY[count]=(minY+maxY) /2;
        count++;
        //28
        ansX[count]=maxX+1;
        ansY[count]=(minY+maxY) /2;
        count++;
    }
    public void bottomL(){
        //29
        ansX[count]=minX-1;
        ansY[count]=minY+1;
        count++;
        //30
        ansX[count]=minX;
        ansY[count]=minY+1;
        count++;
        //31
        ansX[count]=minX+1;
        ansY[count]=minY+1;
        count++;
        //32
        ansX[count]=minX-1;
        ansY[count]=minY;
        count++;
        //33
        ansX[count]=minX;
        ansY[count]=minY;
        count++;
        //34
        ansX[count]=minX+1;
        ansY[count]=minY;
        count++;
        //35
        ansX[count]=minX-1;
        ansY[count]=minY-1;
        count++;
        //36
        ansX[count]=minX;
        ansY[count]=minY-1;
        count++;
        //37
        ansX[count]=minX+1;
        ansY[count]=minY-1;
        count++;
    }
    public void bottomM(){
        //38
        ansX[count]=(minX+maxX) /2;
        ansY[count]=minY+1;
        count++;
        //39
        ansX[count]=(minX+maxX) /2;
        ansY[count]=minY;
        count++;
        //40
        ansX[count]=(minX+maxX) /2;
        ansY[count]=minY-1;
        count++;
    }

    public void bottomR(){
        //41
        ansX[count]=maxX-1;
        ansY[count]=minY+1;
        count++;
        //42
        ansX[count]=maxX;
        ansY[count]=minY+1;
        count++;
        //43
        ansX[count]=maxX+1;
        ansY[count]=minY+1;
        count++;
        //44
        ansX[count]=maxX-1;
        ansY[count]=minY;
        count++;
        //45
        ansX[count]=maxX;
        ansY[count]=minY;
        count++;
        //46
        ansX[count]=maxX+1;
        ansY[count]=minY;
        count++;
        //47
        ansX[count]=maxX-1;
        ansY[count]=minY-1;
        count++;
        //48
        ansX[count]=maxX;
        ansY[count]=minY-1;
        count++;
        //49
        ansX[count]=maxX+1;
        ansY[count]=minY-1;
        count++;
    }




}
