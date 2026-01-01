package org.dows.rfa.open;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.dows.rfa.open.PostResumeStoreEntityRequest;
import org.dows.rfa.open.PostResumeStoreEntityResponse;
import org.dows.rfa.open.PutResumeStoreEntityRequest;
import org.dows.rfa.open.PutResumeStoreEntityResponse;
import org.dows.rfa.open.DeleteResumeStoreEntityRequest;
import org.dows.rfa.open.DeleteResumeStoreEntityResponse;
import org.dows.rfa.open.GetResumeStoreEntityRequest;
import org.dows.rfa.open.GetResumeStoreEntityResponse;
import org.dows.rfa.open.GetResumeStorePageRequest;
import org.dows.rfa.open.GetResumeStorePageResponse;
import org.dows.rfa.open.GetResumeStoreListRequest;
import org.dows.rfa.open.GetResumeStoreListResponse;

@RequiredArgsConstructor
@Tag(name = "OpenResumeStoreRest", description = "简历存储")
@RestController
public class OpenResumeStoreRest{

    @PostMapping("open/resume/store/entity")
    @Operation(summary = "保存")
    public PostResumeStoreEntityResponse postEntity(@RequestBody PostResumeStoreEntityRequest postResumeStoreEntityRequest){
        return null;
    }

    @PutMapping("open/resume/store/entity")
    @Operation(summary = "更新")
    public void putEntity(@RequestBody PutResumeStoreEntityRequest putResumeStoreEntityRequest){
        
    }

    @DeleteMapping("open/resume/store/entity")
    @Operation(summary = "删除")
    public void deleteEntity(@RequestBody DeleteResumeStoreEntityRequest deleteResumeStoreEntityRequest){
        
    }

    @GetMapping("open/resume/store/entity")
    @Operation(summary = "详情")
    public GetResumeStoreEntityResponse getEntity( GetResumeStoreEntityRequest getResumeStoreEntityRequest){
        return null;
    }

    @GetMapping("open/resume/store/page")
    @Operation(summary = "分页")
    public GetResumeStorePageResponse getPage( GetResumeStorePageRequest getResumeStorePageRequest){
        return null;
    }

    @GetMapping("open/resume/store/list")
    @Operation(summary = "列表")
    public GetResumeStoreListResponse getList( GetResumeStoreListRequest getResumeStoreListRequest){
        return null;
    }

}