package org.dows.rfa.open;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.dows.rfa.open.PostResumeApplicaionEntityRequest;
import org.dows.rfa.open.PostResumeApplicaionEntityResponse;
import org.dows.rfa.open.PutResumeApplicaionEntityRequest;
import org.dows.rfa.open.PutResumeApplicaionEntityResponse;
import org.dows.rfa.open.DeleteResumeApplicaionEntityRequest;
import org.dows.rfa.open.DeleteResumeApplicaionEntityResponse;
import org.dows.rfa.open.GetResumeApplicaionEntityRequest;
import org.dows.rfa.open.GetResumeApplicaionEntityResponse;
import org.dows.rfa.open.GetResumeApplicaionPageRequest;
import org.dows.rfa.open.GetResumeApplicaionPageResponse;
import org.dows.rfa.open.GetResumeApplicaionListRequest;
import org.dows.rfa.open.GetResumeApplicaionListResponse;

@RequiredArgsConstructor
@Tag(name = "OpenResumeApplicaionRest", description = "简历申请")
@RestController
public class OpenResumeApplicaionRest{

    @PostMapping("open/resume/applicaion/entity")
    @Operation(summary = "保存")
    public PostResumeApplicaionEntityResponse postEntity(@RequestBody PostResumeApplicaionEntityRequest postResumeApplicaionEntityRequest){
        return null;
    }

    @PutMapping("open/resume/applicaion/entity")
    @Operation(summary = "更新")
    public void putEntity(@RequestBody PutResumeApplicaionEntityRequest putResumeApplicaionEntityRequest){
        
    }

    @DeleteMapping("open/resume/applicaion/entity")
    @Operation(summary = "删除")
    public void deleteEntity(@RequestBody DeleteResumeApplicaionEntityRequest deleteResumeApplicaionEntityRequest){
        
    }

    @GetMapping("open/resume/applicaion/entity")
    @Operation(summary = "详情")
    public GetResumeApplicaionEntityResponse getEntity( GetResumeApplicaionEntityRequest getResumeApplicaionEntityRequest){
        return null;
    }

    @GetMapping("open/resume/applicaion/page")
    @Operation(summary = "分页")
    public GetResumeApplicaionPageResponse getPage( GetResumeApplicaionPageRequest getResumeApplicaionPageRequest){
        return null;
    }

    @GetMapping("open/resume/applicaion/list")
    @Operation(summary = "列表")
    public GetResumeApplicaionListResponse getList( GetResumeApplicaionListRequest getResumeApplicaionListRequest){
        return null;
    }

}