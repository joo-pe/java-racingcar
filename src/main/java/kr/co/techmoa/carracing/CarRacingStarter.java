package kr.co.techmoa.carracing;

import kr.co.techmoa.carracing.ui.dto.InputDTO;
import kr.co.techmoa.carracing.ui.dto.OutputDTO;
import kr.co.techmoa.carracing.service.RacingCarGameService;
import kr.co.techmoa.carracing.ui.InputView;
import kr.co.techmoa.carracing.ui.ResultView;

public class CarRacingStarter {

    public static void main(String[] args) {

        InputView inputView = new InputView();
        InputDTO inputDTO =  inputView.getInputDTO();

        RacingCarGameService racingCarGameService = new RacingCarGameService(inputDTO);
        OutputDTO outputDTO = racingCarGameService.start();

        ResultView resultView = new ResultView();
        resultView.printResult(outputDTO);

    }
}
