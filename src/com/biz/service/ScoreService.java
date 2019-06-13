package com.biz.service;

public interface ScoreService {


	public boolean intputScore(int number
			) throws NumberFormatException; 

	public void makeTotal(); 
	public void makeRank(); 
	public void viewScore(); 
	
}