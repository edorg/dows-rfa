package org.dows.rfa.open;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.dows.rfa.open.PostResumeMatchingEntityRequest;
import org.dows.rfa.open.PutResumeMatchingEntityResponse;
import org.dows.rfa.open.DeleteResumeMatchingEntityResponse;
import org.dows.rfa.open.GetResumeMatchingEntityRequest;
import org.dows.rfa.open.GetResumeMatchingPageRequest;
import org.dows.rfa.open.GetResumeMatchingListRequest;

@RequiredArgsConstructor
@Tag(name = "OpenResumeMatchingRest", description = "简历匹配")
@RestController
public class OpenResumeMatchingRest{

}