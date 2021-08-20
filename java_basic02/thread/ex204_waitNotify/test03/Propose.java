package java_basic02.thread.ex204_waitNotify.test03;

//공유 객체
public class Propose {
    private String propose;

    //동기화 메서드 - 프로포즈 하기
    public synchronized void setPropose(String propose){
        //이미 프로포즈를 했다면 대기
        if(this.propose != null){
            try {
                wait();     //자신은 일시정지 설정 - 철수가 영희의 대답을 기다린다
            } catch (InterruptedException ie){
                ie.getMessage();
            }
        }
        this.propose = propose;
        System.out.println("철수의 고백 : "+ propose);
        notify();           //영희 일시정지 해제
    }

    //동기화 메서드 - 프로포즈 받기
    public synchronized String getPropose(){
        //아직 프로포즈를 받지 않았다면 대기
        if(this.propose == null){
            try {
                wait();     //자신은 일시정지 설정 - 영희가 다른 남자가 고백해주길 기다린다
            } catch (InterruptedException ie){
                ie.getMessage();
            }
        }
        String answer = propose;
        System.out.println("영희의 거절 : "+ answer+ "\n");
        propose = null;     //프로포즈 null 로 만들어서 다시 고백받기
        notify();           //자신은 일시정지 해제 - 영희의 여지 남기기
        return answer;
    }
}