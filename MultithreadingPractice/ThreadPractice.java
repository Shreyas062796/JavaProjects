class multithread extends Thread {
    private Thread newThread;
    private String ThreadName;
    
    public multithread(String ThreadName){
	this.ThreadName = ThreadName;
    }
    
    public void start(){
	if(newThread == null){
	    System.out.println("Starting thread:" + ThreadName);
	    newThread = new Thread(this, this.ThreadName);
	    newThread.start();
	}
    }
    public void run(){
	try{
	for(int x = 0;x <= 5;x++){
	    System.out.println("starting thread: " + ThreadName + "version" + x);
	    newThread.sleep(50);
	}
	}
	catch(Exception e){
	    System.out.println("Thread interrupted");
	}
	System.out.println("thread stopped");
    }
    public void setname(String name){
	this.ThreadName = name;
    }
}

public class ThreadPractice{
    public static void main(String[] args){
	multithread thread = new multithread("Shreyas Thread");
	thread.start();
	thread.run();
	thread.setname("cool stuff");
	thread.start();
	thread.run();
    }
}