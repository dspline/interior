package com.interior.board;

import java.util.ArrayList;

public class ConsultboardDAO {
	//max
		private int getMax(){
			
			int result=0;
				
			return result;
		}
			
	
		//글등록
		public int ConsultboardWrite(ConsultboardDTO cDto){
				
			int result=this.getMax();
				
			return result+1;
				
		}
	
		//글리스트
		public ArrayList<ConsultboardDTO> ConsultboardList(){
					
			ArrayList<ConsultboardDTO> ar = new ArrayList<>();
					
			return ar;
		}
		
		//
		
}
