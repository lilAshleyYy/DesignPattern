package command;

import java.util.ArrayList;

public class WaitorInvoker {
	private ArrayList<Command> commands=null;
	public WaitorInvoker() {
		commands=new ArrayList<Command>();
	}
	public void SetCommand(Command cmd) {
		commands.add(cmd);
	}
	public void orderUp() {
		System.out.println("????????");
		for(Command cmd:commands)
			if(cmd!=null)
				cmd.execute();
	}
}
