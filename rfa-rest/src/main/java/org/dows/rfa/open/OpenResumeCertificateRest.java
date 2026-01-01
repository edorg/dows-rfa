package org.dows.rfa.open;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.dows.rfa.open.PostResumeCertificateEntityRequest;
import org.dows.rfa.open.PostResumeCertificateEntityResponse;
import org.dows.rfa.open.PutResumeCertificateEntityRequest;
import org.dows.rfa.open.PutResumeCertificateEntityResponse;
import org.dows.rfa.open.DeleteResumeCertificateEntityRequest;
import org.dows.rfa.open.DeleteResumeCertificateEntityResponse;
import org.dows.rfa.open.GetResumeCertificateEntityRequest;
import org.dows.rfa.open.GetResumeCertificateEntityResponse;
import org.dows.rfa.open.GetResumeCertificatePageRequest;
import org.dows.rfa.open.GetResumeCertificatePageResponse;
import org.dows.rfa.open.GetResumeCertificateListRequest;
import org.dows.rfa.open.GetResumeCertificateListResponse;

@RequiredArgsConstructor
@Tag(name = "OpenResumeCertificateRest", description = "简历证书")
@RestController
public class OpenResumeCertificateRest{

    @PostMapping("open/resume/certificate/entity")
    @Operation(summary = "保存")
    public PostResumeCertificateEntityResponse postEntity(@RequestBody PostResumeCertificateEntityRequest postResumeCertificateEntityRequest){
        return null;
    }

    @PutMapping("open/resume/certificate/entity")
    @Operation(summary = "更新")
    public void putEntity(@RequestBody PutResumeCertificateEntityRequest putResumeCertificateEntityRequest){
        
    }

    @DeleteMapping("open/resume/certificate/entity")
    @Operation(summary = "删除")
    public void deleteEntity(@RequestBody DeleteResumeCertificateEntityRequest deleteResumeCertificateEntityRequest){
        
    }

    @GetMapping("open/resume/certificate/entity")
    @Operation(summary = "详情")
    public GetResumeCertificateEntityResponse getEntity( GetResumeCertificateEntityRequest getResumeCertificateEntityRequest){
        return null;
    }

    @GetMapping("open/resume/certificate/page")
    @Operation(summary = "分页")
    public GetResumeCertificatePageResponse getPage( GetResumeCertificatePageRequest getResumeCertificatePageRequest){
        return null;
    }

    @GetMapping("open/resume/certificate/list")
    @Operation(summary = "列表")
    public GetResumeCertificateListResponse getList( GetResumeCertificateListRequest getResumeCertificateListRequest){
        return null;
    }

}