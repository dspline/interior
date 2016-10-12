package com.interior.board;


import java.util.ArrayList;



public class FreeboardDAO {

		//max
		private int getMax(){
			
			int result=0;
			
			return result;
		}
		
		//글등록
		public int FreeboardWrite(FreeboardDTO fDto){
			
			int result=this.getMax();
			
			return result+1;
			
		}
		//글리스트
		public ArrayList<FreeboardDTO> FreeboardList(){
			
			ArrayList<FreeboardDTO> ar = new ArrayList<>();
			
			
			return ar;
		}
		//글 하나 보기
		public FreeboardDTO FreeboardView(int num){
			
			FreeboardDTO m=null;
			
			return m;
		}
		
		//수정
		public int mod(FreeboardDTO fDto){
					
			int result=0;
					
			return result;
		}
		
		//삭제
		public int delete(FreeboardDTO fDto){
			int result=0;
			
			return result;
		}
		
		//댓글 쓰기
		public int reply(FreeboardDTO fDto){
			
			int result=0;
			
			return result;
			
		}
		
		
}
