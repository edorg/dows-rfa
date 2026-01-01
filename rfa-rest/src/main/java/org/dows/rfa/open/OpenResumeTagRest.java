package org.dows.rfa.open;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.dows.rfa.open.PostResumeTagEntityRequest;
import org.dows.rfa.open.PostResumeTagEntityResponse;
import org.dows.rfa.open.PutResumeTagEntityRequest;
import org.dows.rfa.open.PutResumeTagEntityResponse;
import org.dows.rfa.open.DeleteResumeTagEntityRequest;
import org.dows.rfa.open.DeleteResumeTagEntityResponse;
import org.dows.rfa.open.GetResumeTagEntityRequest;
import org.dows.rfa.open.GetResumeTagEntityResponse;
import org.dows.rfa.open.GetResumeTagPageRequest;
import org.dows.rfa.open.GetResumeTagPageResponse;
import org.dows.rfa.open.GetResumeTagListRequest;
import org.dows.rfa.open.GetResumeTagListResponse;

@RequiredArgsConstructor
@Tag(name = "OpenResumeTagRest", description = "简历标签")
@RestController
public class OpenResumeTagRest{

    @PostMapping("open/resume/tag/entity")
    @Operation(summary = "保存")
    public PostResumeTagEntityResponse postEntity(@RequestBody PostResumeTagEntityRequest postResumeTagEntityRequest){
        return null;
    }

    @PutMapping("open/resume/tag/entity")
    @Operation(summary = "更新")
    public void putEntity(@RequestBody PutResumeTagEntityRequest putResumeTagEntityRequest){
        
    }

    @DeleteMapping("open/resume/tag/entity")
    @Operation(summary = "删除")
    public void deleteEntity(@RequestBody DeleteResumeTagEntityRequest deleteResumeTagEntityRequest){
        
    }

    @GetMapping("open/resume/tag/entity")
    @Operation(summary = "详情")
    public GetResumeTagEntityResponse getEntity( GetResumeTagEntityRequest getResumeTagEntityRequest){
        return null;
    }

    @GetMapping("open/resume/tag/page")
    @Operation(summary = "分页")
    public GetResumeTagPageResponse getPage( GetResumeTagPageRequest getResumeTagPageRequest){
        return null;
    }

    @GetMapping("open/resume/tag/list")
    @Operation(summary = "列表")
    public GetResumeTagListResponse getList( GetResumeTagListRequest getResumeTagListRequest){
        return null;
    }

}