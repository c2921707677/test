/**
 * 2018年11月23日
 */
package tij.fourteen;

import java.util.Arrays;
import java.util.List;

/**
 * @author chengj
 */
public class SnowRemovalRobot implements Robot {

	private String name;
	
	public SnowRemovalRobot(String name) {
		super();
		this.name = name;
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public String model() {
		// TODO Auto-generated method stub
		return "SnowBot Series 11";
	}

	@Override
	public List<Operation> operations() {
		// TODO Auto-generated method stub
		return Arrays.asList(
				new Operation() {
					
					@Override
					public String description() {
						// TODO Auto-generated method stub
						return name + " can shovel snow";
					}
					
					@Override
					public void command() {
						// TODO Auto-generated method stub
						System.out.println(name + " shoveling snow");
					}
				},
				new Operation() {
					
					@Override
					public String description() {
						// TODO Auto-generated method stub
						return name + " can chip ice";
					}
					
					@Override
					public void command() {
						// TODO Auto-generated method stub
						System.out.println(name + " chipping snow");
					}
				});
	}

	public static void main(String[] args) {
		Robot.Test.test(new SnowRemovalRobot("Slusher"));
	}
	
}
