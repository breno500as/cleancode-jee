package com.cleancode.report;

import javax.enterprise.context.ApplicationScoped;

import com.cleancode.contracts.report.CreateReportBook;

@ApplicationScoped
public class CreateReportBookImpl implements CreateReportBook {

	@Override
	public void create() {
		System.out.println("criando relatorio..");	
	}

}