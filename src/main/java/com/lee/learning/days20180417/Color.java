package com.lee.learning.days20180417;

public enum Color {
	RED{
		public String getColor(){
			return "red";
		}
	},
	YELLOW{
		public String getColor(){
			return "yellow";
		}
	},
	BLACK{
		public String getColor(){
			return "black";
		}
	},
	DARK{
		public String getColor(){
			return "dark";
		}
	},
	WHITE{
		public String getColor(){
			return "white";
		}
	};
	public abstract String getColor();

}
