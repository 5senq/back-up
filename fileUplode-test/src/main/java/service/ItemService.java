package service;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;

import dao.ItemDao;
import dao.ItemImgDao;
import vo.Item;
import vo.ItemImg;

public class ItemService {
	private ItemDao itemDao;
	private ItemImgDao itemImgDao;
	public void addItem(Item item, ItemImg itemImg, String dir) {
		itemDao = new ItemDao();
		itemImgDao = new ItemImgDao();
		Connection conn = null;
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/fileupload","root","java1234");
			conn.setAutoCommit(false);
         
			HashMap<String, Integer> map = itemDao.insertItem(conn, item);
         
			itemImg.setItemNo(map.get("autoKey"));
			itemImgDao.insertItem(conn, itemImg); // itemImg.getItemNo() --> 0
         
			conn.commit();
		} catch(Exception e) {
			try {
				conn.rollback();
				// db작업에 실패시 이미 업로드되어 버린 파일 줄러와 삭제
				File f = new File(dir+"\\"+itemImg.getFilename());
				if(f.exists()) {
					f.delete();
				}
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}