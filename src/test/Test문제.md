# Test



방송 목록은 3가지 타입(Radio, TV, TV/Radio)으로 구분되며 
각 타입의 방송 목록과 채널 정보는 아래와 같습니다. 

Radio 방송 목록 

| 채널 타입 | 채널 ID | 채널 이름 | 방송국 이름 | 주파수 |
| --------- | ------- | --------- | ----------- | ------ |
| Radio     | 3       | A         | KBS         | 100    |
| Radio     | 2       | B         | SBS         | 101    |
| Radio     | 1       | C         | MBC         | 102    |
| Radio     | 4       | D         | YTN         | 103    |

TV 방송 목록 

| 채널 타입 | 채널 ID | 채널 이름 | 방송국 이름 | 주파수 |
| --------- | ------- | --------- | ----------- | ------ |
| TV        | 5       | E         | KBS         | 지상파 |
| TV        | 8       | F         | SBS         | 지상파 |
| TV        | 7       | G         | MBC         | 케이블 |
| TV        | 6       | H         | JTBC        |        |

TV/Radio 방송 목록 

| 채널 타입 | 채널ID | 채널 이름 | 방송국 이름 |
| --------- | ------ | --------- | ----------- |
| TV/Radio  | 3      | I         | KBS         |
| TV/Radio  | 7      | J         | MBC         |

@요구사항 1. 아래와 같이 채널타입별 채널정보를 포함하는 "채널정보 객체" Class 작성 
Class RadioChannel 
Class TVChannel 
Class TVRadioChannel 
@요구사항 2. "채널정보 객체"를 관리하는 ChannelManager Class 작성 
Class ChannelManager 
 ChannelManager 기능 

1. '요구사항 1' 에서 작성된 "RadioChannel, TVChannel, TVRadioChannel의 객체"를 입력받아 
아래 조건에 맞게 "정렬된 리스트" 로 관리하는 기능 
- 채널 ID를 기준으로 오름차순으로 정렬 
- 채널 ID가 동일한 항목은 “Radio<<TV<<TV/Radio” 우선순위 순으로 교체(1개만 유지) 

2. "정렬된 리스트"중 특정 채널 타입에 해당하는 모든 "채널정보 객체"의 해당 채널정보를 모두 출력하는 기능 
(TV/Radio 타입은 TV 타입에도 해당하며 Radio 타입에도 해당한다.) 
ex) 특정 채널타입이 Radio인 경우 출력 결과 : 
채널타입 : Radio, 채널ID : xxx, 채널이름 : xxx, 방송국이름 : xxx, 주파수 : xxx 
채널타입 : TV/Radio, 채널ID : xxx, 채널이름 : xxx, 방송국이름 : xxx 


@요구사항 3. ChannelManager를 생성후 모든 방송 목록(위 표에서 제시된 Radio, TV, TVRadio 방송 목록)의 모든 "채널정보 객체"를 
 생성하여 ChannelManager에 추가. 

@출력 결과물 
1. 요구사항 2-2의 함수를 이용하여 Radio 타입에 해당하는 항목의 채널 정보 모두 출력 
    채널타입: Radio 채널ID: 1 채널이름:C 방송국이름: MBC 주파수: 102 
    채널타입: Radio 채널ID: 2 채널이름:B 방송국이름: SBS 주파수: 101 
    채널타입: TV/Radio 채널ID: 3 채널이름:I 방송국이름: KBS 
    채널타입: Radio 채널ID: 4 채널이름:D 방송국이름: YTN 주파수: 103 
    채널타입: TV/Radio 채널ID: 7 채널이름:J 방송국이름: MBC 
2. 요구사항 2-1로 정렬된 리스트를 순서대로 채널 이름 출력 
    C, B, I, D, E, H, J, 