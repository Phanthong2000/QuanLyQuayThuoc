package gui;

import javax.swing.JFrame;

public class GiaoDienChinh {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Hệ thống quản lý quầy thuốc");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.getContentPane().add(new GiaoDien_TrangChu());
		//frame.getContentPane().add(new GiaoDien_KhachHang());
		frame.getContentPane().add(new HoaDon_GUI());
		frame.pack();
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
	}

}