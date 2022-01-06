package br.com.domain.application;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Example of how to use the interceptor filter.
 *
 * @author Leonardo Faria
 */
@RestController
@RequestMapping("/produto")
public class ProdutoController {
    /*
     * Second Step
     */
    @GetMapping("/uuid/{uuid}")
    public ResponseEntity<?> get(@PathVariable String uuid, @RequestHeader("Authorization") String authorization) {
        System.out.println(String.format("Uuid: %s, auth: %s", uuid, authorization));
        return ResponseEntity.ok().build();
    }
}
