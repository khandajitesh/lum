package com.set.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.set.dao.SubjectUnitMasterDao;
import com.set.model.StudentNotes;
import com.set.model.StudentNotesDetails;
import com.set.model.SubjectUnitMaster;
import com.set.model.SubjectUnitMasterDetails;
import com.set.model.SubjectUnitMasterId;
@Service
public class SubjectUnitMasterServiceImpl implements SubjectUnitMasterService {
	
	@Autowired
	public SubjectUnitMasterDao subjectUnitMasterDao;

	@Override
	public void save(SubjectUnitMaster subjectUnitMaster) {
		subjectUnitMasterDao.save(subjectUnitMaster);
	}

	@Override
	public SubjectUnitMasterDetails getAllSubjectUnitMaster(int pagenumber,String searchdata) {
		return subjectUnitMasterDao.getAllSubjectUnitMaster(pagenumber, searchdata);
	}

	@Override
	public List<SubjectUnitMaster> getAllSubjectUnitMasterSelect() {
		return subjectUnitMasterDao.getAllSubjectUnitMasterSelect();
	}

	@Override
	public void updateSubjectUnitMaster(SubjectUnitMaster subjectUnitMaster) {
		subjectUnitMasterDao.updateSubjectUnitMaster(subjectUnitMaster);
	}

	@Override
	public void deleteSubjectUnitMaster(SubjectUnitMaster subjectUnitMaster) {
		subjectUnitMasterDao.deleteSubjectUnitMaster(subjectUnitMaster);
	}

	@Override
	public boolean IsExist(String notes) {
		// TODO Auto-generated method stub
		return subjectUnitMasterDao.IsExist(notes);
	}

	@Override
	public int totalSubjectUnitMaster() {
		return subjectUnitMasterDao.totalSubjectUnitMaster();
	}

	@Override
	public SubjectUnitMaster getSubjectUnitMasterById(SubjectUnitMasterId subjectUnitMasterId) {
		return subjectUnitMasterDao.getSubjectUnitMasterById(subjectUnitMasterId);
	}
	@Override
	public List<Map<String, String>> getUnitBySubjectList(String SubjectId) {
		return subjectUnitMasterDao.getUnitBySubjectList(SubjectId);
	}

	@Override
	public List<Map<String, String>> getTopicByUnitList(String SubjectId, String UnitId) {
		return subjectUnitMasterDao.getTopicByUnitList(SubjectId, UnitId);
	}

}
