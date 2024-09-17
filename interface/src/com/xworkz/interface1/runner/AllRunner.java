package com.xworkz.interface1.runner;

import com.xworkz.interface1.internal.BankRule;
import com.xworkz.interface1.internal.CollegeRule;
import com.xworkz.interface1.internal.RailwayStationRule;
import com.xworkz.interface1.internal.TempleRule;
import com.xworkz.interface1.internal.TrafficRule;

import implimentation.AcademicPolicies;
import implimentation.BankAccount;
import implimentation.LightSignal;
import implimentation.RailCenter;
import implimentation.Spiritus;

public class AllRunner {

	public static void main(String[] args) {
	


			TrafficRule trafficRule = new LightSignal();
			trafficRule.AvoidStuntRiding();
			trafficRule.DontCarryExcessPassengers();
			trafficRule.FollowTrafficPoliceInstructions();
			trafficRule.MaintainSafeDistance();
			trafficRule.NoMobilePhoneUse();
			trafficRule.noOfLights();
			trafficRule.NoStuntRiding();
			trafficRule.ObeySpeedLimits();
			trafficRule.StopatRedLights();
			trafficRule.StopatRedLights();
			trafficRule.UseHeadlightsDuringLowVisibility();
			trafficRule.UseIndicators();
			trafficRule.UseRearviewMirrors();
			trafficRule.WearSeatbelts();

			System.out.println("=================");
			CollegeRule collegeRule = new AcademicPolicies();
			collegeRule.AttendClassesRegularly();
			collegeRule.FollowExamRules();
			collegeRule.FollowSafetyProtocols();
			collegeRule.MaintainAcademicIntegrity();
			collegeRule.NoUnauthorizedAccess();
			collegeRule.NoVandalism();
			collegeRule.ParticipateinClass();
			collegeRule.RespectFacultyandStaff();
			collegeRule.SubmitAssignmentsonTime();
			collegeRule.UseCampusResourcesResponsibly();

			System.out.println("=================");

			TempleRule templeRule = new Spiritus();
			templeRule.Cleanliness();
			templeRule.DressCode();
			templeRule.FollowRituals();
			templeRule.GuidancefromPriests();
			templeRule.NoCommercialActivities();
			templeRule.NoLittering();
			templeRule.NoPets();
			templeRule.NoPhotography();
			templeRule.NoSmokingorAlcohol();
			templeRule.Offerings();
			templeRule.RemoveFootwear();
			templeRule.RespectOtherWorshippers();
			templeRule.RespectSacredSpaces();
			templeRule.ReverenceandRespect();
			templeRule.Silence();

			System.out.println("=================");

			RailwayStationRule railwayStationRule = new RailCenter();
			railwayStationRule.Cleanliness();
			railwayStationRule.Luggage();
			railwayStationRule.NoAlcohol();
			railwayStationRule.NoLoitering();
			railwayStationRule.NoSmoking();
			railwayStationRule.NoSoliciting();
			railwayStationRule.NoTrespassing();
			railwayStationRule.NoVandalism();
			railwayStationRule.Queueing();
			railwayStationRule.RespectAnnouncements();
			railwayStationRule.RespectStaff();
			railwayStationRule.SafetyFirst();
			railwayStationRule.TicketRequirement();
			railwayStationRule.UseFootbridges();

			System.out.println("=================");

			BankRule bankRule = new BankAccount();

			bankRule.AccountClosureRules();
			bankRule.AccountDormancy();
			bankRule.AccountHolderName();
			bankRule.ChequeClearance();
			bankRule.CorrectAccountNumber();
			bankRule.CustomerGrievanceRedressal();
			bankRule.FraudDetectionandAlerts();
			bankRule.InterestCalculation();
			bankRule.OverdraftProtection();
			bankRule.OverdraftProtection();
			bankRule.PrivacyandDataProtection();
			bankRule.SeeAccountHolderName();
			bankRule.LoanEligibility();
		}

	}
