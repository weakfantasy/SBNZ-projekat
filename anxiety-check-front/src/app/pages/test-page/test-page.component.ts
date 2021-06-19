import { DatePipe } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { TestResult } from 'src/app/model/test-result';
import { UserService } from 'src/app/services/user.service';
import { StressAnswers } from '../../model/stress-answers';


@Component({
  selector: 'app-test-page',
  templateUrl: './test-page.component.html',
  styleUrls: ['./test-page.component.scss']
})
export class TestPageComponent implements OnInit {

  stressAns: StressAnswers[];
  revStressAns: StressAnswers[];
  stressForm!: FormGroup;
  commonAnxietyForm : FormGroup;
  predominantForm : FormGroup;
  stressPoints : number;
  testResult! : TestResult;
  showAnxiety : boolean;
  showStress : boolean;
  showDisorder : boolean;
  showResult : boolean;
  today : Date;
  loading : boolean;
  result : any;
  constructor(private userService : UserService, public datepipe: DatePipe) {
      this.today = new Date();
      this.loading = false;
      this.showAnxiety = false;
      this.showStress = true;
      this.showDisorder = false;
      this.showResult = false;
      this.testResult = {};
      this.testResult.commonSympotms = [];
      this.testResult.depressionSymptoms = [];
      this.testResult.predominantSymptoms = [];
      this.testResult.riskFactors = [];
      this.stressPoints = 0;
      this.stressAns =  [
        { value: 0, name: 'Never' },
        { value: 1, name: 'Almost Never' },
        { value: 2,name: 'Sometimes' },
        { value: 3, name: 'Fairly Often' },
        { value: 4, name: 'Very Often' },

      ];

      this.revStressAns =  [
        { value: 4, name: 'Never' },
        { value: 3, name: 'Almost Never' },
        { value: 2,name: 'Sometimes' },
        { value: 1, name: 'Fairly Often' },
        { value: 0, name: 'Very Often' },

      ];

      this.stressForm = new FormGroup({
        sympt1: new FormControl('', [Validators.required]),
        sympt2: new FormControl('', [Validators.required]),
        sympt3: new FormControl('', [Validators.required]),
        sympt4: new FormControl('', [Validators.required]),
        sympt5 : new FormControl('', [Validators.required]),
        sympt6: new FormControl('', [Validators.required]),
        sympt7: new FormControl('', [Validators.required]),
        sympt8: new FormControl('', [Validators.required]),
        sympt9: new FormControl('', [Validators.required]),
        sympt10 : new FormControl('', [Validators.required]),
    });

    this.commonAnxietyForm = new FormGroup({
      asympt1: new FormControl('', [Validators.required]),
      asympt2: new FormControl('', [Validators.required]),
      asympt3: new FormControl('', [Validators.required]),
      asympt4: new FormControl('', [Validators.required]),
      asympt5 : new FormControl('', [Validators.required]),
      asympt7: new FormControl('', [Validators.required]),
      asympt8: new FormControl('', [Validators.required]),
      asympt10 : new FormControl('', [Validators.required]),
    });

    this.predominantForm = new FormGroup({
      Restlesness : new FormControl(''),
      ConstantWorrying: new FormControl(''),
      FeelingsOfDread: new FormControl(''),
      DifficultyConcentrating: new FormControl(''),
      Irritability: new FormControl(''),
      IntrusiveThoughts: new FormControl(''),

      SenseOfDoom: new FormControl(''),
      FearOfDeath: new FormControl(''),
      PanicAttacks: new FormControl(''),

      FearOfCriticism: new FormControl(''),
      FearOfAttention: new FormControl(''),
      FearOfEmbarassement: new FormControl(''),
      FearOfJudgement: new FormControl(''),

      UpsettingDreams: new FormControl(''),
      EmotionalDistress: new FormControl(''),
      UnwantedMemories: new FormControl(''),
      RelivingOfPast: new FormControl(''),

      ExcessiveConcernIllnes: new FormControl(''),
      ExcessiveConcernDeath: new FormControl(''),
      ExcessiveConcernMortality: new FormControl(''),
      FearOfContamination: new FormControl(''),

      FearOfLosingControl: new FormControl(''),
      FearOfFainting: new FormControl(''),

      hopelessness: new FormControl(''),
      suicidalThougths: new FormControl(''),
      unbearablePain: new FormControl(''),
      noReasonToLive: new FormControl('')
    })
  }

  ngOnInit() {
  }

  test(){
    Object.keys(this.stressForm.controls).forEach(key => {
      this.stressPoints = this.stressPoints + this.stressForm.get(key).value;
});
    this.testResult.stressPoints = this.stressPoints;
    this.showAnxiety = true;
    this.showStress = false;
    /* this.testResult.commonSympotms = [1,2,3,4,5];
    this.testResult.depressionSymptoms = [0];
    this.testResult.predominantSymptoms = [1,2,3,4,5,8,9,11,15];
    this.testResult.depressionSymptoms = [];
    this.testResult.start = "2020-12-02"; */
    console.log(this.testResult.stressPoints);
    /* this.userService.testFunction().subscribe(res => {
      console.log("Done");
    })

    this.userService.checkAnxiety(this.testResult).subscribe(res => {
      console.log("Done");
    }) */
  }

  collectAnxietySympt(){
    Object.keys(this.commonAnxietyForm.controls).forEach(key => {
      if(key !== "asympt5" && this.commonAnxietyForm.get(key).value !== "no" ){
        this.testResult.commonSympotms.push(parseInt(this.commonAnxietyForm.get(key).value));
      }else if(key === "asympt5"){
        this.testResult.start = this.datepipe.transform(this.commonAnxietyForm.get(key).value, 'yyyy-MM-dd');

      }

    });
    this.showAnxiety = false;
    this.showDisorder = true;
  }

  collectDisorderSympt(){
    this.loading = true;
    Object.keys(this.predominantForm.controls).forEach(key => {

        if(this.predominantForm.get(key).value !== "" && key!== "hopElessness" && key!== "suicidalThougths" && key!== "unbearablePain" && key!== "noReasonToLive")
        {
          this.testResult.predominantSymptoms.push(parseInt(this.predominantForm.get(key).value));
          console.log(key + " " +this.predominantForm.get(key).value);
        }else if(this.predominantForm.get(key).value !== ""){
          this.testResult.depressionSymptoms.push(parseInt(this.predominantForm.get(key).value));
        }

    });

    console.log(this.testResult);

    this.userService.checkAnxiety(this.testResult).subscribe(res => {
      this.loading = false;
      console.log(res);
      this.result = res;
      this.showDisorder = false;
      this.showResult = true;
    })



  }

  reset(){
    Object.keys(this.predominantForm.controls).forEach(key => {
      this.predominantForm.get(key).reset();
    });
  }

}
