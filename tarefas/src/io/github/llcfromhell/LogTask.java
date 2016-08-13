package io.github.llcfromhell;

import org.apache.tools.ant.Task;

public class LogTask extends Task {
	
	private String level;
    private String msg;
    
    public void execute() {

        if("info".equals(this.level)) {
            this.msg = "INFO: " + this.msg;
        }

        System.out.println(this.msg);
    }

	public void setMsg(String msg) {
		this.msg = msg;
	}
    

}
