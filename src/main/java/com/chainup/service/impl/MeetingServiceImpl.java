package com.chainup.service.impl;

import com.chainup.dao.DepartmentMapper;
import com.chainup.dao.MeetingMapper;
import com.chainup.dao.RoomMapper;
import com.chainup.entity.Meeting;
import com.chainup.entity.MeetingExample;
import com.chainup.service.MeetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author QX
 * @date 2020/10/13
 */
@Service
public class MeetingServiceImpl implements MeetingService {

    @Autowired
    private MeetingMapper meetingMapper;

    @Autowired
    private RoomMapper roomMapper;

    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    public List<Meeting> findAll(MeetingExample example) {
        return meetingMapper.selectByExample(example);
    }
}
