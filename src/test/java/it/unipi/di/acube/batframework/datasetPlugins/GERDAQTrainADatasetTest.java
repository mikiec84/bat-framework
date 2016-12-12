package it.unipi.di.acube.batframework.datasetPlugins;

import it.unipi.di.acube.batframework.problems.C2WDataset;
import it.unipi.di.acube.batframework.utils.WikipediaInterface;


public class GERDAQTrainADatasetTest extends DatasetTestBase{

	@Override
	public C2WDataset build(WikipediaInterface i) {
		return DatasetBuilder.getGerdaqTrainA(i);
	}

}
