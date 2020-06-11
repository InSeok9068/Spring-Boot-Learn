package com.example.demo.batchConfig;

//@Slf4j // log 사용을 위한 lombok 어노테이션
//@RequiredArgsConstructor // 생성자 DI를 위한 lombok 어노테이션
//@Configuration
//public class BatchConfiguration {
//    private final JobBuilderFactory jobBuilderFactory; // 생성자 DI 받음
//    private final StepBuilderFactory stepBuilderFactory; // 생성자 DI 받음
//
//    @Bean
//    public Job simpleJob() {
//        return jobBuilderFactory.get("simpleJob")
//                .start(simpleStep1())
//                .build();
//    }
//
//    @Bean
//    public Step simpleStep1() {
//        return stepBuilderFactory.get("simpleStep1")
//                .tasklet((contribution, chunkContext) -> {
//                    log.info(">>>>> This is Step1");
//                    return RepeatStatus.FINISHED;
//                })
//                .build();
//    }
//}
