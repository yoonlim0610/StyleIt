package web.service.face;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import web.dto.Product;
import web.dto.Styling;
import web.util.imgPaging;

public interface ShopService {

//	public List<Product> getList();
	
//	제품 상세 
	public Product getProduct(int p_no);
	
//	로그인시 제품 리스트 얻어오기
	public List<Product> getProductList(HashMap<String, Object> map);
	
//	비 로그인시 제품 리스트 얻어오기
	public List<Product> getProductNoLogin(imgPaging paging);
	
//	제품 좋아요  업데이트
	public void pLikeUpdate(HashMap<String, Object> like);

//	제품 별 좋아요 개수 반환
	public int plikeCnt(int p_no);

//	좋아요 여부 확인
	public int plikeCheck(HashMap<String, Object> like);
	
//	로그인시 제품 상세보기	
	public Product getProductView(HashMap<String, Integer> map);

//	비로그인시 제품 상세보기	
	public Product getProductViewNoLogin(int p_no);

//	로그인시 제품별 스타일링 정보 얻어오기
	public List<Styling> getStylingByProduct(HashMap<String, Integer> map);

//	비로그인시 제품별 스타일링 정보 얻어오기
	public List<Styling> getStylingByProductNoLogin(int p_no);
	
//	로그인시 유사한 제품 정보 얻어오기(5개)
	public List<Product> getSimilarProduct(HashMap<String, Object> map);

//	비로그인시 유사한 제품 정보 얻어오기(5개)
	public List<Product> getSimilarProductNoLogin(Product p);
	
// 현재페이지 반환
	public int getCurPage(HttpServletRequest req);

//	총 제품 수 얻기
	public int getTotalCount();
	
//	//SHOP List 출력
//	public List<Product> selectSearchList();
//	
//	//추천or추천삭제
//	public int recommend();
//	
//	//콜렉션추가or삭제
//	public String collection();
//	
//	//상세페이지 List출력
//	public List<Styling> getStylingList();
	
}
