package com.training.testdriveapp.staff;

import java.util.List;

public interface StaffService {
    Staff addNewStaff(Staff newStaff) throws StaffException;

    Staff updateStaffDetails(Staff staff) throws StaffException;

    Staff getByStaffId(Integer staffId) throws StaffException;

    Staff deleteStaff(Integer staffId) throws StaffException;

    List<Staff> getAllStaffs() throws StaffException;
}
