/**
 * 2018年11月26日
 */
package test;

import java.util.Arrays;

/**
 * @author chengj
 */
public class TestByte {

	/**
	 * @param argsvoid
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[] mBluetoothMac = new byte[]{0x68,(byte)0xef,0x43,(byte)0xa0,(byte)0x00,0x03};
		String btMacStr = "";
		System.out.println("client.mBluetoothMac = " + Arrays.toString(mBluetoothMac));
        for (int i = 0; i < mBluetoothMac.length; i++) {
            String strTemp = Integer.toHexString(0xFF & mBluetoothMac[i]);
            btMacStr = btMacStr + strTemp + ":";
            System.out.println("clientConnected btMacStr = " + btMacStr.toString());
        }
        btMacStr = btMacStr.substring(0, btMacStr.lastIndexOf(":"));
        System.out.println("clientConnected btMacStr = " + btMacStr.toString());
        
        
        StringBuffer stringBuilder = new StringBuffer("");   

        for (int i = 0; i < mBluetoothMac.length; i++) {   
            int v = mBluetoothMac[i] & 0xFF;   
            String hv = Integer.toHexString(v);   
            if (hv.length() < 2) {   
            	stringBuilder.append(0);   
            }   
            stringBuilder.append(hv);   
            if (i != mBluetoothMac.length - 1)
            	stringBuilder.append(":");
        }
        System.out.println(stringBuilder.toString());
	}

}
