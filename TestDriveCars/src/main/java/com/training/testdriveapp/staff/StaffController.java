package com.training.testdriveapp.staff;

import com.training.testdriveapp.customer.Customer;
import com.training.testdriveapp.customer.CustomerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StaffController{
    @Autowired
    private StaffService staffService;

    @PostMapping("Add Staff")
    public Staff addNewStaff(Staff newStaff) throws StaffException
    {
        return this.staffService.addNewStaff(newStaff);
    }

    @PutMapping("Update Staff")
    public Staff updateAccount(@RequestBody Staff staff) throws StaffException {
        return this.staffService.updateStaffDetails(staff);
    }

    @GetMapping("Get Staff by Id/{staffid}")
    public Staff getByStaffId(@PathVariable("id") Integer staffId) throws StaffException {
        return this.staffService.getByStaffId(staffId);
    }
    @DeleteMapping("Delete Staff/{staffid}")
    public Staff deleteAccountById(@PathVariable Integer staffId) throws StaffException {
        return this.staffService.deleteStaff(staffId);
    }
    @GetMapping("getAllStaffs")
    public List<Staff> getAllAccounts() throws StaffException {
        return this.staffService.getAllStaffs();
    }

}
