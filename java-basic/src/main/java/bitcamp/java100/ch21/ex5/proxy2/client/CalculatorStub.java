package bitcamp.java100.ch21.ex5.proxy2.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

import bitcamp.java100.ch21.ex5.proxy2.Calculator;

public class CalculatorStub implements Calculator {

	@Override
	public int plus(int a, int b) {
	return request("plus", a, b);
	}

	@Override
	public int minus(int a, int b) {
		return request("minus", a, b);
	}

	private int request(String methodName, int a, int b) {
		try (
				Socket s = new Socket("localhost", 9999);
				DataInputStream in = new DataInputStream(s.getInputStream());
				DataOutputStream out = new DataOutputStream(s.getOutputStream());

		) {

			out.writeUTF(methodName);
			out.writeInt(a);
			out.writeInt(b);
			
			if (in.readInt() == 200) {
				return in.readInt();
			} else {
				throw new RuntimeException(in.readUTF());
			}
		} catch (Exception e) {
			throw new RuntimeException(e);

		}

	}

}
