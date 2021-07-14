package com.dao;

import java.util.List;

import com.entities.IssueEntity;

public interface IssueDao {
	public Integer addIssue(IssueEntity issueEntity);
	public Integer updateIssue(IssueEntity issueEntity);
	public Integer deleteIssue(IssueEntity issueEntity);
	public IssueEntity getIssueById(Integer id);
	public List<IssueEntity> getAllIssue();
}
