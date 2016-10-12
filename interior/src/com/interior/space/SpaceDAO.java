package com.interior.space;

import java.util.ArrayList;



public class SpaceDAO {
	//max
			private int getMax(){
				
				int result=0;
				
				return result;
			}
			
			//공간 등록
			public int SpaceWrite(SpaceDTO sDto){
				
				int result=this.getMax();
				
				return result+1;
				
			}
			//공간 리스트
			public ArrayList<SpaceDTO> SpaceList(){
				
				ArrayList<SpaceDTO> ar = new ArrayList<>();
				
				
				return ar;
			}
			//공간 하나 보기
			public SpaceDTO SpaceView(int num){
				
				SpaceDTO m=null;
				
				return m;
			}
			
			
			
			//수정
			public int mod(SpaceDTO fDto){
						
				int result=0;
						
				return result;
			}
			
			//삭제
			public int delete(SpaceDTO fDto){
				int result=0;
				
				return result;
			}
}
