package org.dows.rfa.open;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.dows.rfa.open.PostResumeProjectEntityResponse;
import org.dows.rfa.open.PutResumeProjectEntityResponse;
import org.dows.rfa.open.DeleteResumeProjectEntityRequest;
import org.dows.rfa.open.DeleteResumeProjectEntityResponse;
import org.dows.rfa.open.GetResumeProjectEntityRequest;
import org.dows.rfa.open.GetResumeProjectPageRequest;
import org.dows.rfa.open.GetResumeProjectListRequest;

@RequiredArgsConstructor
@Tag(name = "OpenResumeProjectRest", description = "简历项目")
@RestController
public class OpenResumeProjectRest{

    @DeleteMapping("open/resume/project/entity")
    @Operation(summary = "删除")
    public void deleteEntity(@RequestBody DeleteResumeProjectEntityRequest deleteResumeProjectEntityRequest){
        
    }

}