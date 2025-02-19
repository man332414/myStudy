package controller;

import java.io.IOException;
import java.util.ArrayList;
import dao.BookRepository;
import dto.Book;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/products")
public class product_comtroller extends HttpServlet 
{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		//Verify Step 1 : 콘솔을 찍어서 매핑이 되는지 확인
		System.out.println("/product 연결완료");
		// 전처리
		
		// 모델
		ArrayList<Book> arr = BookRepository.getAllBooks();
		
		// 이동
		// 데이터 보낼 때 키, 값
		req.setAttribute("arry", arr);
		RequestDispatcher ds = req.getRequestDispatcher("books.jsp");
		ds.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		
	}

}
