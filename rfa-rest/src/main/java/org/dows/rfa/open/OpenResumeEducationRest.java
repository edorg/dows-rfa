package org.dows.rfa.open;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.dows.rfa.open.PostResumeEducationEntityRequest;
import org.dows.rfa.open.PostResumeEducationEntityResponse;
import org.dows.rfa.open.PutResumeEducationEntityRequest;
import org.dows.rfa.open.PutResumeEducationEntityResponse;
import org.dows.rfa.open.DeleteResumeEducationEntityRequest;
import org.dows.rfa.open.DeleteResumeEducationEntityResponse;
import org.dows.rfa.open.GetResumeEducationEntityRequest;
import org.dows.rfa.open.GetResumeEducationEntityResponse;
import org.dows.rfa.open.GetResumeEducationPageRequest;
import org.dows.rfa.open.GetResumeEducationPageResponse;
import org.dows.rfa.open.GetResumeEducationListRequest;
import org.dows.rfa.open.GetResumeEducationListResponse;

@RequiredArgsConstructor
@Tag(name = "OpenResumeEducationRest", description = "简历教育")
@RestController
public class OpenResumeEducationRest{

    @PostMapping("open/resume/education/entity")
    @Operation(summary = "保存")
    public PostResumeEducationEntityResponse postEntity(@RequestBody PostResumeEducationEntityRequest postResumeEducationEntityRequest){
        return null;
    }

    @PutMapping("open/resume/education/entity")
    @Operation(summary = "更新")
    public void putEntity(@RequestBody PutResumeEducationEntityRequest putResumeEducationEntityRequest){
        
    }

    @DeleteMapping("open/resume/education/entity")
    @Operation(summary = "删除")
    public void deleteEntity(@RequestBody DeleteResumeEducationEntityRequest deleteResumeEducationEntityRequest){
        
    }

    @GetMapping("open/resume/education/entity")
    @Operation(summary = "详情")
    public GetResumeEducationEntityResponse getEntity( GetResumeEducationEntityRequest getResumeEducationEntityRequest){
        return null;
    }

    @GetMapping("open/resume/education/page")
    @Operation(summary = "分页")
    public GetResumeEducationPageResponse getPage( GetResumeEducationPageRequest getResumeEducationPageRequest){
        return null;
    }

    @GetMapping("open/resume/education/list")
    @Operation(summary = "列表")
    public GetResumeEducationListResponse getList( GetResumeEducationListRequest getResumeEducationListRequest){
        return null;
    }

}