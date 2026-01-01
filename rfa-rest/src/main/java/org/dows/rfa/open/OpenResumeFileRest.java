package org.dows.rfa.open;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.dows.rfa.open.PostResumeFileEntityRequest;
import org.dows.rfa.open.PostResumeFileEntityResponse;
import org.dows.rfa.open.PutResumeFileEntityRequest;
import org.dows.rfa.open.PutResumeFileEntityResponse;
import org.dows.rfa.open.DeleteResumeFileEntityRequest;
import org.dows.rfa.open.DeleteResumeFileEntityResponse;
import org.dows.rfa.open.GetResumeFileEntityRequest;
import org.dows.rfa.open.GetResumeFileEntityResponse;
import org.dows.rfa.open.GetResumeFilePageRequest;
import org.dows.rfa.open.GetResumeFilePageResponse;
import org.dows.rfa.open.GetResumeFileListRequest;
import org.dows.rfa.open.GetResumeFileListResponse;

@RequiredArgsConstructor
@Tag(name = "OpenResumeFileRest", description = "简历文件")
@RestController
public class OpenResumeFileRest{

    @PostMapping("open/resume/file/entity")
    @Operation(summary = "保存")
    public PostResumeFileEntityResponse postEntity(@RequestBody PostResumeFileEntityRequest postResumeFileEntityRequest){
        return null;
    }

    @PutMapping("open/resume/file/entity")
    @Operation(summary = "更新")
    public void putEntity(@RequestBody PutResumeFileEntityRequest putResumeFileEntityRequest){
        
    }

    @DeleteMapping("open/resume/file/entity")
    @Operation(summary = "删除")
    public void deleteEntity(@RequestBody DeleteResumeFileEntityRequest deleteResumeFileEntityRequest){
        
    }

    @GetMapping("open/resume/file/entity")
    @Operation(summary = "详情")
    public GetResumeFileEntityResponse getEntity( GetResumeFileEntityRequest getResumeFileEntityRequest){
        return null;
    }

    @GetMapping("open/resume/file/page")
    @Operation(summary = "分页")
    public GetResumeFilePageResponse getPage( GetResumeFilePageRequest getResumeFilePageRequest){
        return null;
    }

    @GetMapping("open/resume/file/list")
    @Operation(summary = "列表")
    public GetResumeFileListResponse getList( GetResumeFileListRequest getResumeFileListRequest){
        return null;
    }

}