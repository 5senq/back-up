<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oreilly.servlet.*"%>
<%@ page import="com.oreilly.servlet.multipart.*"%>
<%
	// 원본 request 객체를 cos api로 랩핑
	// new MultipartRequest(원본request, 업로드폴더, 최대파일사이즈, 인코딩, 중복된 이름정책(파일이름이 중복되지않게))
	// 포르젝트안 upload 폴더의 실제 물리적 위치를 반환
	String dir = request.getServletContext().getRealPath("/upload");
	int maxFileSize = 1024 * 1024 * 100; // 100Mbyte

	DefaultFileRenamePolicy fp = new DefaultFileRenamePolicy(); // upload 폴더 내 동일한 이름이 있으면 뒤에 숫자를 추가
	
	MultipartRequest mreq
		= new MultipartRequest(request, dir, maxFileSize, "utf-8", null);
	
	// MultipartRequest로 원본 request를 랩핑후에는 스트림으로 받을 필요 없이 MultipartRequest의 api를 사용하면 된다

	// input type="text"
	String itemName = mreq.getParameter("itemName"); // MultipartRequest.getparameter()

	// input type="file" 바이너리 파일은 마임타입 형태의 파일로 변환되어 upload 폴더에 자동으로 저장
	String contentType = mreq.getContentType("itemImg");
	String originalFileName = mreq.getOriginalFileName("itemImg"); // 원본 파일이름
	String fileSystemName = mreq.getFilesystemName("itemImg"); // 저장된 파일이름(Default)
	
	System.out.println("문자열 매개값");
	System.out.println(itemName);
	System.out.println("파일 매개값");
	System.out.println(originalFileName);
	System.out.println(fileSystemName);
	
	
%>