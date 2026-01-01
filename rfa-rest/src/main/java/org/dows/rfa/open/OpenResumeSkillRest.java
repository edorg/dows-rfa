package org.dows.rfa.open;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.dows.rfa.open.PostResumeSkillEntityRequest;
import org.dows.rfa.open.PostResumeSkillEntityResponse;
import org.dows.rfa.open.PutResumeSkillEntityRequest;
import org.dows.rfa.open.PutResumeSkillEntityResponse;
import org.dows.rfa.open.DeleteResumeSkillEntityRequest;
import org.dows.rfa.open.DeleteResumeSkillEntityResponse;
import org.dows.rfa.open.GetResumeSkillEntityRequest;
import org.dows.rfa.open.GetResumeSkillEntityResponse;
import org.dows.rfa.open.GetResumeSkillPageRequest;
import org.dows.rfa.open.GetResumeSkillPageResponse;
import org.dows.rfa.open.GetResumeSkillListRequest;
import org.dows.rfa.open.GetResumeSkillListResponse;

@RequiredArgsConstructor
@Tag(name = "OpenResumeSkillRest", description = "简历技能")
@RestController
public class OpenResumeSkillRest{

    @PostMapping("open/resume/skill/entity")
    @Operation(summary = "保存")
    public void postEntity(@RequestBody PostResumeSkillEntityRequest postResumeSkillEntityRequest){
        
    }

    @PutMapping("open/resume/skill/entity")
    @Operation(summary = "更新")
    public void putEntity(@RequestBody PutResumeSkillEntityRequest putResumeSkillEntityRequest){
        
    }

    @DeleteMapping("open/resume/skill/entity")
    @Operation(summary = "删除")
    public void deleteEntity(@RequestBody DeleteResumeSkillEntityRequest deleteResumeSkillEntityRequest){
        
    }

    @GetMapping("open/resume/skill/entity")
    @Operation(summary = "详情")
    public GetResumeSkillEntityResponse getEntity( GetResumeSkillEntityRequest getResumeSkillEntityRequest){
        return null;
    }

    @GetMapping("open/resume/skill/page")
    @Operation(summary = "分页")
    public GetResumeSkillPageResponse getPage( GetResumeSkillPageRequest getResumeSkillPageRequest){
        return null;
    }

    @GetMapping("open/resume/skill/list")
    @Operation(summary = "列表")
    public GetResumeSkillListResponse getList( GetResumeSkillListRequest getResumeSkillListRequest){
        return null;
    }

}