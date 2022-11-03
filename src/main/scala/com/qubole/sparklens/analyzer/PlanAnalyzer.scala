package com.qubole.sparklens.analyzer

import com.qubole.sparklens.common.AppContext
import scala.collection.mutable

/*
 * Generates plan from event logs
 */
class PlanAnalyzer extends AppAnalyzer {

  def analyze(appContext: AppContext, startTime: Long, endTime: Long): String = {
    val ac = appContext.filterByStartAndEndTime(startTime, endTime)
    val out = new mutable.StringBuilder()
    out.println("\nPrinting physical plan....\n")
    out.append(ac.physicalPlan)
    out.println("\nDone printing physical plan...\n============================\n")
    out.toString()
  }
}
