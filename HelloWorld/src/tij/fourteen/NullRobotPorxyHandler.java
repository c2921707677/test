///**
// * 2018年11月23日
// */
//package tij.fourteen;
//
//import java.lang.reflect.InvocationHandler;
//import java.lang.reflect.Method;
//import java.util.Collection;
//import java.util.Collections;
//import java.util.List;
//
///**
// * @author chengj
// */
//public class NullRobotPorxyHandler implements InvocationHandler{
//
//	private String nullName;
//	
//	private Robot proxied = new NRobot();
//	
//	/**
//	 * 
//	 */
//	NullRobotPorxyHandler(Class<? extends Robot> type) {
//		nullName = type.getSimpleName() + " NullRobot";
//	}
//	
//	private class NRobot implements Null, Robot {
//
//		/* (non-Javadoc)
//		 * @see tij.fourteen.Robot#name()
//		 */
//		@Override
//		public String name() {
//			// TODO Auto-generated method stub
//			return nullName;
//		}
//
//		/* (non-Javadoc)
//		 * @see tij.fourteen.Robot#model()
//		 */
//		@Override
//		public String model() {
//			// TODO Auto-generated method stub
//			return nullName;
//		}
//
//		/* (non-Javadoc)
//		 * @see tij.fourteen.Robot#operations()
//		 */
//		@Override
//		public List<Operation> operations() {
//			// TODO Auto-generated method stub
//			return Collections.emptyList();
//		}
//		
//	}
//	
//	/**
//	 * @param argsvoid
//	 */
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//	/* (non-Javadoc)
//	 * @see java.lang.reflect.InvocationHandler#invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[])
//	 */
//	@Override
//	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//		// TODO Auto-generated method stub
//		throw Throwable {
//			return method.invoke(proxied, args);
//		}
//	}
//
//}
