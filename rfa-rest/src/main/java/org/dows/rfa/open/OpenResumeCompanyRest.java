package org.dows.rfa.open;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.dows.rfa.open.PostResumeCompanyEntityResponse;
import org.dows.rfa.open.PutResumeCompanyEntityResponse;
import org.dows.rfa.open.DeleteResumeCompanyEntityRequest;
import org.dows.rfa.open.DeleteResumeCompanyEntityResponse;
import org.dows.rfa.open.GetResumeCompanyEntityRequest;
import org.dows.rfa.open.GetResumeCompanyPageRequest;
import org.dows.rfa.open.GetResumeCompanyListRequest;

@RequiredArgsConstructor
@Tag(name = "OpenResumeCompanyRest", description = "简历公司")
@RestController
public class OpenResumeCompanyRest{

    @DeleteMapping("open/resume/company/entity")
    @Operation(summary = "删除")
    public void deleteEntity(@RequestBody DeleteResumeCompanyEntityRequest deleteResumeCompanyEntityRequest){
        
    }

}