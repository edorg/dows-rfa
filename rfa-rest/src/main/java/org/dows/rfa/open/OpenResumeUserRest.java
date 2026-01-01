package org.dows.rfa.open;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.dows.rfa.open.PostResumeUserEntityRequest;
import org.dows.rfa.open.PostResumeUserEntityResponse;
import org.dows.rfa.open.PutResumeUserEntityRequest;
import org.dows.rfa.open.PutResumeUserEntityResponse;
import org.dows.rfa.open.DeleteResumeUserEntityRequest;
import org.dows.rfa.open.DeleteResumeUserEntityResponse;
import org.dows.rfa.open.GetResumeUserEntityRequest;
import org.dows.rfa.open.GetResumeUserEntityResponse;
import org.dows.rfa.open.GetResumeUserPageRequest;
import org.dows.rfa.open.GetResumeUserPageResponse;
import org.dows.rfa.open.GetResumeUserListRequest;
import org.dows.rfa.open.GetResumeUserListResponse;

@RequiredArgsConstructor
@Tag(name = "OpenResumeUserRest", description = "简历文件")
@RestController
public class OpenResumeUserRest{

    @PostMapping("open/resume/user/entity")
    @Operation(summary = "保存")
    public PostResumeUserEntityResponse postEntity(@RequestBody PostResumeUserEntityRequest postResumeUserEntityRequest){
        return null;
    }

    @PutMapping("open/resume/user/entity")
    @Operation(summary = "更新")
    public void putEntity(@RequestBody PutResumeUserEntityRequest putResumeUserEntityRequest){
        
    }

    @DeleteMapping("open/resume/user/entity")
    @Operation(summary = "删除")
    public void deleteEntity(@RequestBody DeleteResumeUserEntityRequest deleteResumeUserEntityRequest){
        
    }

    @GetMapping("open/resume/user/entity")
    @Operation(summary = "详情")
    public GetResumeUserEntityResponse getEntity( GetResumeUserEntityRequest getResumeUserEntityRequest){
        return null;
    }

    @GetMapping("open/resume/user/page")
    @Operation(summary = "分页")
    public GetResumeUserPageResponse getPage( GetResumeUserPageRequest getResumeUserPageRequest){
        return null;
    }

    @GetMapping("open/resume/user/list")
    @Operation(summary = "列表")
    public GetResumeUserListResponse getList( GetResumeUserListRequest getResumeUserListRequest){
        return null;
    }

}