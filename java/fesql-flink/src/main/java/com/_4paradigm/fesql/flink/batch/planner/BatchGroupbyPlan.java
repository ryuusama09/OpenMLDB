package com._4paradigm.fesql.flink.batch.planner;

import com._4paradigm.fesql.flink.common.FesqlException;
import com._4paradigm.fesql.flink.common.planner.GeneralPlanContext;
import com._4paradigm.fesql.vm.PhysicalGroupNode;
import org.apache.flink.table.api.Table;

public class BatchGroupbyPlan {

    public static Table gen(GeneralPlanContext planContext, PhysicalGroupNode node, Table childTable) throws FesqlException {
        // Do nothing for groupby node and the child node should use groupby API
        return childTable;
    }

}
