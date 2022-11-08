public ListSpeechSynthesisTasksResult listSpeechSynthesisTasks(ListSpeechSynthesisTasksRequest request) {request = beforeClientExecution(request);return executeListSpeechSynthesisTasks(request);}
public UpdateJourneyStateResult updateJourneyState(UpdateJourneyStateRequest request) {request = beforeClientExecution(request);return executeUpdateJourneyState(request);}
public void removePresentationFormat() {remove1stProperty(PropertyIDMap.PID_PRESFORMAT);}
public CellRangeAddressList(int firstRow, int lastRow, int firstCol, int lastCol) {this();addCellRangeAddress(firstRow, firstCol, lastRow, lastCol);}
public void delete(int key) {int i = binarySearch(mKeys, 0, mSize, key);if (i >= 0) {if (mValues[i] != DELETED) {mValues[i] = DELETED;mGarbage = true;}}}
public CreateBranchCommand setStartPoint(RevCommit startPoint) {checkCallable();this.startCommit = startPoint;this.startPoint = null;return this;}
public int centerX() {return x + w / 2;}
public ListPresetsResult listPresets() {return listPresets(new ListPresetsRequest());}
public DeleteFolderContentsResult deleteFolderContents(DeleteFolderContentsRequest request) {request = beforeClientExecution(request);return executeDeleteFolderContents(request);}
public GetConsoleOutputResult getConsoleOutput(GetConsoleOutputRequest request) {request = beforeClientExecution(request);return executeGetConsoleOutput(request);}
public PutMailboxPermissionsResult putMailboxPermissions(PutMailboxPermissionsRequest request) {request = beforeClientExecution(request);return executePutMailboxPermissions(request);}
public Cluster disableSnapshotCopy(DisableSnapshotCopyRequest request) {request = beforeClientExecution(request);return executeDisableSnapshotCopy(request);}
public static String stripExtension(String filename) {int idx = filename.indexOf('.');if (idx != -1) {filename = filename.substring(0, idx);}return filename;}
public ByteBuffer putInt(int value) {throw new ReadOnlyBufferException();}
public int lastIndexOf(final int o){int rval = _limit - 1;for (; rval >= 0; rval--){if (o == _array[ rval ]){break;}}return rval;}
public void setCountsByTime(int[] counts, long msecStep) {countsByTime = counts;countsByTimeStepMSec = msecStep;}
public FeatHdrRecord(RecordInputStream in) {futureHeader = new FtrHeader(in);isf_sharedFeatureType = in.readShort();reserved = in.readByte();cbHdrData = in.readInt();rgbHdrData = in.readRemainder();}
public CopyOnWriteArrayList() {elements = EmptyArray.OBJECT;}
public WriteRequest(DeleteRequest deleteRequest) {setDeleteRequest(deleteRequest);}
public void readFully(byte[] buf){_in.readFully(buf);}
public static Cell getCell(Row row, int columnIndex) {Cell cell = row.getCell(columnIndex);if (cell == null) {cell = row.createCell(columnIndex);}return cell;}
public void setPackConfig(PackConfig pc) {this.packConfig = pc;}
public String getSignerName() {return "HMAC-SHA1";}
public IntervalSet or(IntSet a) {IntervalSet o = new IntervalSet();o.addAll(this);o.addAll(a);return o;}
public String toString() {return getClass().getName() + " [" +_value +"]";}
public DescribeVpcEndpointServicePermissionsResult describeVpcEndpointServicePermissions(DescribeVpcEndpointServicePermissionsRequest request) {request = beforeClientExecution(request);return executeDescribeVpcEndpointServicePermissions(request);}
public static byte[] copyOfRange(byte[] original, int start, int end) {if (start > end) {throw new IllegalArgumentException();}int originalLength = original.length;if (start < 0 || start > originalLength) {throw new ArrayIndexOutOfBoundsException();}int resultLength = end - start;int copyLength = Math.min(resultLength, originalLength - start);byte[] result = new byte[resultLength];System.arraycopy(original, start, result, 0, copyLength);return result;}
public ListTopicsRequest(String nextToken) {setNextToken(nextToken);}
public void finish(FieldInfos fis, int numDocs) throws IOException {if (!pendingDocs.isEmpty()) {flush();numDirtyChunks++; }if (numDocs != this.numDocs) {throw new RuntimeException("Wrote " + this.numDocs + " docs, finish called with numDocs=" + numDocs);}indexWriter.finish(numDocs, vectorsStream.getFilePointer());vectorsStream.writeVLong(numChunks);vectorsStream.writeVLong(numDirtyChunks);CodecUtil.writeFooter(vectorsStream);}
public boolean isIndexTerm(BytesRef term, TermStats stats) {if (count >= interval) {count = 1;return true;} else {count++;return false;}}
public AssociateDhcpOptionsResult associateDhcpOptions(AssociateDhcpOptionsRequest request) {request = beforeClientExecution(request);return executeAssociateDhcpOptions(request);}
public ValueEval evaluate(int srcRowIndex, int srcColumnIndex, ValueEval arg0, ValueEval arg1,ValueEval arg2) {return evaluate(srcRowIndex, srcColumnIndex, arg0, arg1, arg2, DEFAULT_ARG3);}
public void disconnect() {if (sock.isConnected())sock.disconnect();}
public PredictionContext add(PredictionContext ctx) {if ( ctx==PredictionContext.EMPTY ) return PredictionContext.EMPTY;PredictionContext existing = cache.get(ctx);if ( existing!=null ) {return existing;}cache.put(ctx, ctx);return ctx;}
public UploadLayerPartResult uploadLayerPart(UploadLayerPartRequest request) {request = beforeClientExecution(request);return executeUploadLayerPart(request);}
public String getScriptText() {return getScriptText(null, null);}
public DescribeClusterSubnetGroupsResult describeClusterSubnetGroups() {return describeClusterSubnetGroups(new DescribeClusterSubnetGroupsRequest());}
public char setIndex(int position) {if (position < getBeginIndex() || position > getEndIndex())throw new IllegalArgumentException("Illegal Position: " + position);index = start + position;return current();}
public GetPhoneNumberOrderResult getPhoneNumberOrder(GetPhoneNumberOrderRequest request) {request = beforeClientExecution(request);return executeGetPhoneNumberOrder(request);}
public EpsilonTransition(ATNState target, int outermostPrecedenceReturn) {super(target);this.outermostPrecedenceReturn = outermostPrecedenceReturn;}
public DiffCommand setContextLines(int contextLines) {this.contextLines = contextLines;return this;}
public RejectVpcPeeringConnectionResult rejectVpcPeeringConnection(RejectVpcPeeringConnectionRequest request) {request = beforeClientExecution(request);return executeRejectVpcPeeringConnection(request);}
public static boolean equals(int[] array1, int[] array2) {if (array1 == array2) {return true;}if (array1 == null || array2 == null || array1.length != array2.length) {return false;}for (int i = 0; i < array1.length; i++) {if (array1[i] != array2[i]) {return false;}}return true;}
public static void main(String[] args) throws IOException {if (args.length<1) {System.err.println("Usage: java QualityQueriesFinder <index-dir>");System.exit(1);}QualityQueriesFinder qqf = new QualityQueriesFinder(FSDirectory.open(Paths.get(args[0])));String q[] = qqf.bestQueries("body",20);for (int i=0; i<q.length; i++) {System.out.println(newline+formatQueryAsTrecTopic(i,q[i],null,null));}}
public CharsRef(char[] chars, int offset, int length) {this.chars = chars;this.offset = offset;this.length = length;assert isValid();}
public UpdateIPSetResult updateIPSet(UpdateIPSetRequest request) {request = beforeClientExecution(request);return executeUpdateIPSet(request);}
public void print(Object obj) {print(String.valueOf(obj));}
public String toString() {return "IndexFileDeleter.CommitPoint(" + segmentsFileName + ")";}
public synchronized boolean waitForGeneration(long targetGen, int maxMS) throws InterruptedException {if (targetGen > searchingGen) {reopenLock.lock();waitingGen = Math.max(waitingGen, targetGen);try {reopenCond.signal();} finally {reopenLock.unlock();}long startMS = System.nanoTime()/1000000;while (targetGen > searchingGen) {if (maxMS < 0) {wait();} else {long msLeft = (startMS + maxMS) - System.nanoTime()/1000000;if (msLeft <= 0) {return false;} else {wait(msLeft);}}}}return true;}
public StringBuffer append(boolean b) {return append(b ? "true" : "false");}
public ByteBuffer put(int index, byte b) {throw new ReadOnlyBufferException();}
public int getLineCount() {return lineCount;}
public boolean equals( Object o ) {return o instanceof DutchStemmer;}
public CreateNotificationSubscriptionResult createNotificationSubscription(CreateNotificationSubscriptionRequest request) {request = beforeClientExecution(request);return executeCreateNotificationSubscription(request);}
public boolean isOutdated() {return snapshot.isModified(getFile());}
public DescribeVirtualInterfacesResult describeVirtualInterfaces() {return describeVirtualInterfaces(new DescribeVirtualInterfacesRequest());}
public void onChanged() {buildMap();for (DataSetObserver o : mObservers) {o.onChanged();}}
public DeleteEventTrackerResult deleteEventTracker(DeleteEventTrackerRequest request) {request = beforeClientExecution(request);return executeDeleteEventTracker(request);}
public boolean matches(ValueEval x) {if (x instanceof BlankEval) {switch(getCode()) {case CmpOp.NONE:case CmpOp.EQ:return _value.length() == 0;case CmpOp.NE:return _value.length() != 0;}return false;}if(!(x instanceof StringEval)) {return false;}String testedValue = ((StringEval) x).getStringValue();if (testedValue.length() < 1 && _value.length() < 1) {switch(getCode()) {case CmpOp.NONE: return true;case CmpOp.EQ:   return false;case CmpOp.NE:   return true;}return false;}if (_pattern != null) {return evaluate(_pattern.matcher(testedValue).matches());}return evaluate(testedValue.compareToIgnoreCase(_value));}
public ListWebsiteAuthorizationProvidersResult listWebsiteAuthorizationProviders(ListWebsiteAuthorizationProvidersRequest request) {request = beforeClientExecution(request);return executeListWebsiteAuthorizationProviders(request);}
public void write(char[] buf, int offset, int count) {doWrite(buf, offset, count);}
public String formatAsString() {if(isWholeColumnReference()) {returnCellReference.convertNumToColString(_firstCell.getCol())+ ":" +CellReference.convertNumToColString(_lastCell.getCol());}StringBuilder sb = new StringBuilder(32);sb.append(_firstCell.formatAsString());if(!_isSingleCell) {sb.append(CELL_DELIMITER);if(_lastCell.getSheetName() == null) {sb.append(_lastCell.formatAsString());} else {_lastCell.appendCellReference(sb);}}return sb.toString();}
public Graphics create(){return new EscherGraphics(escherGroup, workbook,foreground, font, verticalPointsPerPixel );}
public DoubleDocValues(ValueSource vs) {this.vs = vs;}
public static CharArraySet getDefaultStopSet(){return DefaultSetHolder.DEFAULT_STOP_SET;}
public DeleteLoadBalancerPolicyResult deleteLoadBalancerPolicy(DeleteLoadBalancerPolicyRequest request) {request = beforeClientExecution(request);return executeDeleteLoadBalancerPolicy(request);}
public ReplicationGroup decreaseReplicaCount(DecreaseReplicaCountRequest request) {request = beforeClientExecution(request);return executeDecreaseReplicaCount(request);}
public Result update(RevWalk walk) throws IOException {requireCanDoUpdate();try {return result = updateImpl(walk, new Store() {@OverrideResult execute(Result status) throws IOException {if (status == Result.NO_CHANGE)return status;return doUpdate(status);}});} catch (IOException x) {result = Result.IO_FAILURE;throw x;}}
public Set<String> getChanged() {return Collections.unmodifiableSet(diff.getChanged());}
public static String toHex(long value) {StringBuilder sb = new StringBuilder(16);writeHex(sb, value, 16, "");return sb.toString();}
public int createPlaceholder() {return _offset++;}
@Override public boolean equals(Object o) {if (o instanceof Map.Entry) {Map.Entry other = (Map.Entry) o;return (key == null ? other.getKey() == null : key.equals(other.getKey()))&& (value == null ? other.getValue() == null : value.equals(other.getValue()));}return false;}
public ValueEval evaluate(int srcRowIndex, int srcColumnIndex, ValueEval arg0,ValueEval arg1) {double result;try {double d0 = NumericFunction.singleOperandEvaluate(arg0, srcRowIndex, srcColumnIndex);double d1 = NumericFunction.singleOperandEvaluate(arg1, srcRowIndex, srcColumnIndex);double logE = Math.log(d0);if (Double.compare(d1, Math.E) == 0) {result = logE;} else {result = logE / Math.log(d1);}NumericFunction.checkValue(result);} catch (EvaluationException e) {return e.getErrorEval();}return new NumberEval(result);}
public DeleteFilterResult deleteFilter(DeleteFilterRequest request) {request = beforeClientExecution(request);return executeDeleteFilter(request);}
public CreateInstanceSnapshotResult createInstanceSnapshot(CreateInstanceSnapshotRequest request) {request = beforeClientExecution(request);return executeCreateInstanceSnapshot(request);}
public List<Token> getTokens(int start, int stop) {return getTokens(start, stop, null);}
public static TermGroupFacetCollector createTermGroupFacetCollector(String groupField,String facetField,boolean facetFieldMultivalued,BytesRef facetPrefix,int initialSize) {if (facetFieldMultivalued) {return new MV(groupField, facetField, facetPrefix, initialSize);} else {return new SV(groupField, facetField, facetPrefix, initialSize);}}
public RenameAlbumRequest() {super("CloudPhoto", "2017-07-11", "RenameAlbum", "cloudphoto");setProtocol(ProtocolType.HTTPS);}
@Override public boolean contains(Object object) {synchronized (mutex) {return c.contains(object);}}
public CharBuffer put(char[] src, int srcOffset, int charCount) {if (charCount > remaining()) {throw new BufferOverflowException();}System.arraycopy(src, srcOffset, backingArray, offset + position, charCount);position += charCount;return this;}
public LegendRecord(RecordInputStream in) {field_1_xAxisUpperLeft = in.readInt();field_2_yAxisUpperLeft = in.readInt();field_3_xSize          = in.readInt();field_4_ySize          = in.readInt();field_5_type           = in.readByte();field_6_spacing        = in.readByte();field_7_options        = in.readShort();}
public static byte[] encodedTypeString(int typeCode) {switch (typeCode) {case OBJ_COMMIT:return ENCODED_TYPE_COMMIT;case OBJ_TREE:return ENCODED_TYPE_TREE;case OBJ_BLOB:return ENCODED_TYPE_BLOB;case OBJ_TAG:return ENCODED_TYPE_TAG;default:throw new IllegalArgumentException(MessageFormat.format(JGitText.get().badObjectType, Integer.valueOf(typeCode)));}}
public ObjectId getCalulatedPatchId() {return ObjectId.fromRaw(digest.digest());}
public DefaultRowHeightRecord() {field_1_option_flags = 0x0000;field_2_row_height = DEFAULT_ROW_HEIGHT;}
public final ByteBuffer encode(CharBuffer buffer) {try {return newEncoder().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE).encode(buffer);} catch (CharacterCodingException ex) {throw new Error(ex.getMessage(), ex);}}
public final FloatBuffer get(float[] dst, int dstOffset, int floatCount) {if (floatCount > remaining()) {throw new BufferUnderflowException();}System.arraycopy(backingArray, offset + position, dst, dstOffset, floatCount);position += floatCount;return this;}
public boolean hasNext() {return nextEntry != null;}
public DeleteNatGatewayResult deleteNatGateway(DeleteNatGatewayRequest request) {request = beforeClientExecution(request);return executeDeleteNatGateway(request);}
public String resolveNameXText(int refIndex, int definedNameIndex) {return linkTable.resolveNameXText(refIndex, definedNameIndex, this);}
public void setMultiFields(CharSequence[] fields) {if (fields == null) {fields = new CharSequence[0];}getQueryConfigHandler().set(ConfigurationKeys.MULTI_FIELDS, fields);}
public boolean isCancelled() {lock.lock();try {return pm.isCancelled();} finally {lock.unlock();}}
public RemoveTargetsResult removeTargets(RemoveTargetsRequest request) {request = beforeClientExecution(request);return executeRemoveTargets(request);}
public FuzzyQuery(Term term, int maxEdits, int prefixLength, int maxExpansions, boolean transpositions) {super(term.field());if (maxEdits < 0 || maxEdits > LevenshteinAutomata.MAXIMUM_SUPPORTED_DISTANCE) {throw new IllegalArgumentException("maxEdits must be between 0 and " + LevenshteinAutomata.MAXIMUM_SUPPORTED_DISTANCE);}if (prefixLength < 0) {throw new IllegalArgumentException("prefixLength cannot be negative.");}if (maxExpansions <= 0) {throw new IllegalArgumentException("maxExpansions must be positive.");}this.term = term;this.maxEdits = maxEdits;this.prefixLength = prefixLength;this.transpositions = transpositions;this.maxExpansions = maxExpansions;int[] codePoints = FuzzyTermsEnum.stringToUTF32(term.text());this.termLength = codePoints.length;this.automata = FuzzyTermsEnum.buildAutomata(term.text(), codePoints, prefixLength, transpositions, maxEdits);setRewriteMethod(new MultiTermQuery.TopTermsBlendedFreqScoringRewrite(maxExpansions));this.ramBytesUsed = calculateRamBytesUsed(term, this.automata);}
public CheckoutCommand checkout() {return new CheckoutCommand(repo);}
public ValueEval evaluate(String sheetName, int rowIndex, int columnIndex) {EvaluationCell cell = _sewb.getEvaluationCell(sheetName, rowIndex, columnIndex);switch (cell.getCellType()) {case BOOLEAN:return BoolEval.valueOf(cell.getBooleanCellValue());case ERROR:return ErrorEval.valueOf(cell.getErrorCellValue());case FORMULA:return _evaluator.evaluate(cell);case NUMERIC:return new NumberEval(cell.getNumericCellValue());case STRING:return new StringEval(cell.getStringCellValue());case BLANK:return null;default:throw new IllegalStateException("Bad cell type (" + cell.getCellType() + ")");}}
public PutFileSystemPolicyResult putFileSystemPolicy(PutFileSystemPolicyRequest request) {request = beforeClientExecution(request);return executePutFileSystemPolicy(request);}
public long fileLength(String name) throws IOException {ensureOpen();FileEntry e = entries.get(IndexFileNames.stripSegmentName(name));if (e == null)throw new FileNotFoundException(name);return e.length;}
public DescribeCacheClustersResult describeCacheClusters() {return describeCacheClusters(new DescribeCacheClustersRequest());}
public void setObjectId(RevObject obj) {setObjectId(obj, obj.getType());}
public boolean rowHasCells(int row) {if (row >= records.length) {return false;}CellValueRecordInterface[] rowCells=records[row];if(rowCells==null) return false;for(int col=0;col<rowCells.length;col++) {if(rowCells[col]!=null) return true;}return false;}
public TokenStream create(TokenStream input) {return new SpanishLightStemFilter(input);}
public StoredField(String name, double value) {super(name, TYPE);fieldsData = value;}
public DescribePublicIpv4PoolsResult describePublicIpv4Pools(DescribePublicIpv4PoolsRequest request) {request = beforeClientExecution(request);return executeDescribePublicIpv4Pools(request);}
public IndexRevision(IndexWriter writer) throws IOException {IndexDeletionPolicy delPolicy = writer.getConfig().getIndexDeletionPolicy();if (!(delPolicy instanceof SnapshotDeletionPolicy)) {throw new IllegalArgumentException("IndexWriter must be created with SnapshotDeletionPolicy");}this.writer = writer;this.sdp = (SnapshotDeletionPolicy) delPolicy;this.commit = sdp.snapshot();this.version = revisionVersion(commit);this.sourceFiles = revisionFiles(commit);}
public void setTabIdArray(short[] array) {_tabids = array.clone();}
public UpdateObjectAttributesResult updateObjectAttributes(UpdateObjectAttributesRequest request) {request = beforeClientExecution(request);return executeUpdateObjectAttributes(request);}
public GetGameSessionLogUrlResult getGameSessionLogUrl(GetGameSessionLogUrlRequest request) {request = beforeClientExecution(request);return executeGetGameSessionLogUrl(request);}
public RefCount(T object) {this.object = object;}
public ByteBuffer put(int index, byte b) {checkIndex(index);backingArray[offset + index] = b;return this;}
public IntervalSet LOOK(ATNState s, ATNState stopState, RuleContext ctx) {IntervalSet r = new IntervalSet();boolean seeThruPreds = true; PredictionContext lookContext = ctx != null ? PredictionContext.fromRuleContext(s.atn, ctx) : null;_LOOK(s, stopState, lookContext,r, new HashSet<ATNConfig>(), new BitSet(), seeThruPreds, true);return r;}
public int getValidationType() {return _validationType;}
public DeleteTagCommand tagDelete() {return new DeleteTagCommand(repo);}
public SortRescorer(Sort sort) {this.sort = sort;}
public void verifyBelongsToWorkbook(HSSFWorkbook wb) {if(wb.getWorkbook() != _workbook) {throw new IllegalArgumentException("This Style does not belong to the supplied Workbook. Are you trying to assign a style from one workbook to the cell of a differnt workbook?");}}
public StringBuffer insert(int index, Object obj) {return insert(index, obj == null ? "null" : obj.toString());}
public boolean containsKey(CharSequence cs) {if(cs == null)throw new NullPointerException();return false;}
public int compareTo(HSSFRichTextString r) {return _string.compareTo(r._string);}
public RequestSpotInstancesRequest(String spotPrice) {setSpotPrice(spotPrice);}
public ObjectId getNewObjectId() {return newObjectId;}
public void setDeltaBaseAsOffset(boolean deltaBaseAsOffset) {this.deltaBaseAsOffset = deltaBaseAsOffset;}
public LengthFilterFactory(Map<String, String> args) {super(args);min = requireInt(args, MIN_KEY);max = requireInt(args, MAX_KEY);if (!args.isEmpty()) {throw new IllegalArgumentException("Unknown parameters: " + args);}}
public TruncateTokenFilter(TokenStream input, int length) {super(input);if (length < 1)throw new IllegalArgumentException("length parameter must be a positive number: " + length);this.length = length;}
public ListDomainsResult listDomains() {return listDomains(new ListDomainsRequest());}
public ArabicStemFilter create(TokenStream input) {return new ArabicStemFilter(input);}
public PushCommand setRefSpecs(RefSpec... specs) {checkCallable();this.refSpecs.clear();Collections.addAll(refSpecs, specs);return this;}
public BlameGenerator setDiffAlgorithm(DiffAlgorithm algorithm) {diffAlgorithm = algorithm;return this;}
public GroupingSearch setIncludeMaxScore(boolean includeMaxScore) {this.includeMaxScore = includeMaxScore;return this;}
public Field[] createIndexableFields(Shape shape) {double distErr = SpatialArgs.calcDistanceFromErrPct(shape, distErrPct, ctx);return createIndexableFields(shape, distErr);}
public PutMethodResponseResult putMethodResponse(PutMethodResponseRequest request) {request = beforeClientExecution(request);return executePutMethodResponse(request);}
public LegacyCredentials(Credential legacyCrendential) {this.legacyCredential = legacyCrendential;}
public DescribeFeatureTransformationResult describeFeatureTransformation(DescribeFeatureTransformationRequest request) {request = beforeClientExecution(request);return executeDescribeFeatureTransformation(request);}
public DeleteRouteResult deleteRoute(DeleteRouteRequest request) {request = beforeClientExecution(request);return executeDeleteRoute(request);}
public AssociatePhoneNumbersWithVoiceConnectorResult associatePhoneNumbersWithVoiceConnector(AssociatePhoneNumbersWithVoiceConnectorRequest request) {request = beforeClientExecution(request);return executeAssociatePhoneNumbersWithVoiceConnector(request);}
public long ramBytesUsed() {long size = BASE_RAM_BYTES_USED + RamUsageEstimator.shallowSizeOf(blocks);if (blocks.length > 0) {size += (blocks.length - 1) * bytesUsedPerBlock;size += RamUsageEstimator.sizeOf(blocks[blocks.length - 1]);}return size;}
public short readShort(){return _in.readShort();}
public UpdatePipelineNotificationsResult updatePipelineNotifications(UpdatePipelineNotificationsRequest request) {request = beforeClientExecution(request);return executeUpdatePipelineNotifications(request);}
public StringWriter append(char c) {write(c);return this;}
public Iterator<V> iterator() {return new ValueIterator();}
public UnitsRecord(RecordInputStream in) {field_1_units = in.readShort();}
public boolean isEmpty() {return first;}
public String toString() {return "ANY_DIFF"; }
public UpdateDomainNameResult updateDomainName(UpdateDomainNameRequest request) {request = beforeClientExecution(request);return executeUpdateDomainName(request);}
public DeleteSnapshotRequest(String snapshotId) {setSnapshotId(snapshotId);}
public void readFully(byte[] buf) {readFully(buf, 0, buf.length);}
public SliceReader(IntBlockPool pool) {this.pool = pool;}
public void setDeltaSearchMemoryLimit(long memoryLimit) {deltaSearchMemoryLimit = memoryLimit;}
public String toString(){StringBuilder buffer = new StringBuilder();buffer.append("[BOOKBOOL]\n");buffer.append("    .savelinkvalues  = ").append(Integer.toHexString(getSaveLinkValues())).append("\n");buffer.append("[/BOOKBOOL]\n");return buffer.toString();}
public DescribeTransitGatewayAttachmentsResult describeTransitGatewayAttachments(DescribeTransitGatewayAttachmentsRequest request) {request = beforeClientExecution(request);return executeDescribeTransitGatewayAttachments(request);}
public CreateVpcResult createVpc(CreateVpcRequest request) {request = beforeClientExecution(request);return executeCreateVpc(request);}
public DescribeElasticGpusResult describeElasticGpus(DescribeElasticGpusRequest request) {request = beforeClientExecution(request);return executeDescribeElasticGpus(request);}
public IntBuffer put(int c) {if (position == limit) {throw new BufferOverflowException();}byteBuffer.putInt(position++ * SizeOf.INT, c);return this;}
public UpdateEndpointsBatchResult updateEndpointsBatch(UpdateEndpointsBatchRequest request) {request = beforeClientExecution(request);return executeUpdateEndpointsBatch(request);}
public void fromRaw(byte[] bs, int p) {w1 = NB.decodeInt32(bs, p);w2 = NB.decodeInt32(bs, p + 4);w3 = NB.decodeInt32(bs, p + 8);w4 = NB.decodeInt32(bs, p + 12);w5 = NB.decodeInt32(bs, p + 16);}
public static OpenSshConfig get(FS fs) {File home = fs.userHome();if (home == null)home = new File(".").getAbsoluteFile(); final File config = new File(new File(home, SshConstants.SSH_DIR),SshConstants.CONFIG);return new OpenSshConfig(home, config);}
public VCenterRecord(RecordInputStream in) {field_1_vcenter = in.readShort();}
public synchronized InputStream obtainFile(String sessionID, String source, String fileName) throws IOException {ensureOpen();ReplicationSession session = sessions.get(sessionID);if (session != null && session.isExpired(expirationThresholdMilllis)) {releaseSession(sessionID);session = null;}if (session == null) {throw new SessionExpiredException("session (" + sessionID + ") expired while obtaining file: source=" + source+ " file=" + fileName);}sessions.get(sessionID).markAccessed();return session.revision.revision.open(source, fileName);}
public DownloadDefaultKeyPairResult downloadDefaultKeyPair(DownloadDefaultKeyPairRequest request) {request = beforeClientExecution(request);return executeDownloadDefaultKeyPair(request);}
public DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsResult describeLocalGatewayRouteTableVirtualInterfaceGroupAssociations(DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequest request) {request = beforeClientExecution(request);return executeDescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociations(request);}
public ResetEbsDefaultKmsKeyIdResult resetEbsDefaultKmsKeyId(ResetEbsDefaultKmsKeyIdRequest request) {request = beforeClientExecution(request);return executeResetEbsDefaultKmsKeyId(request);}
public int getPropertiesPerBlock() {return bigBlockSize / POIFSConstants.PROPERTY_SIZE;}
public ValueEval evaluate(int srcRowIndex, int srcColumnIndex, ValueEval numberVE) {return this.evaluate(srcRowIndex, srcColumnIndex, numberVE, null);}
public GetFindingsStatisticsResult getFindingsStatistics(GetFindingsStatisticsRequest request) {request = beforeClientExecution(request);return executeGetFindingsStatistics(request);}
public DBCluster modifyDBCluster(ModifyDBClusterRequest request) {request = beforeClientExecution(request);return executeModifyDBCluster(request);}
public LimitTokenCountFilterFactory(Map<String, String> args) {super(args);maxTokenCount = requireInt(args, MAX_TOKEN_COUNT_KEY);consumeAllTokens = getBoolean(args, CONSUME_ALL_TOKENS_KEY, false);if (!args.isEmpty()) {throw new IllegalArgumentException("Unknown parameters: " + args);}}
public MatchNoDocsQuery build(QueryNode queryNode) throws QueryNodeException {if (!(queryNode instanceof MatchNoDocsQueryNode)) {throw new QueryNodeException(new MessageImpl(QueryParserMessages.LUCENE_QUERY_CONVERSION_ERROR, queryNode.toQueryString(new EscapeQuerySyntaxImpl()), queryNode.getClass().getName()));}return new MatchNoDocsQuery();}
public GetUserPolicyRequest(String userName, String policyName) {setUserName(userName);setPolicyName(policyName);}
public Cluster rotateEncryptionKey(RotateEncryptionKeyRequest request) {request = beforeClientExecution(request);return executeRotateEncryptionKey(request);}
public int getLinesAdded() {return nAdded;}
public List<Token> getHiddenTokensToLeft(int tokenIndex, int channel) {lazyInit();if ( tokenIndex<0 || tokenIndex>=tokens.size() ) {throw new IndexOutOfBoundsException(tokenIndex+" not in 0.."+(tokens.size()-1));}if (tokenIndex == 0) {return null;}int prevOnChannel =previousTokenOnChannel(tokenIndex - 1, Lexer.DEFAULT_TOKEN_CHANNEL);if ( prevOnChannel == tokenIndex - 1 ) return null;int from = prevOnChannel+1;int to = tokenIndex-1;return filterForChannel(from, to, channel);}
public ValidDBInstanceModificationsMessage describeValidDBInstanceModifications(DescribeValidDBInstanceModificationsRequest request) {request = beforeClientExecution(request);return executeDescribeValidDBInstanceModifications(request);}
public final void add(RevFlag flag) {flags |= flag.mask;}
public void clear() {Iterator<E> it = iterator();while (it.hasNext()) {it.next();it.remove();}}
public RegisterImageResult registerImage(RegisterImageRequest request) {request = beforeClientExecution(request);return executeRegisterImage(request);}
public boolean equals(Object other) {return sameClassAs(other) &&term.equals(((TermQuery) other).term);}
public URI(String scheme, String authority, String path, String query,String fragment) throws URISyntaxException {if (scheme != null && path != null && !path.isEmpty() && path.charAt(0) != '/') {throw new URISyntaxException(path, "Relative path");}StringBuilder uri = new StringBuilder();if (scheme != null) {uri.append(scheme);uri.append(':');}if (authority != null) {uri.append("");AUTHORITY_ENCODER.appendEncoded(uri, authority);}if (path != null) {PATH_ENCODER.appendEncoded(uri, path);}if (query != null) {uri.append('?');ALL_LEGAL_ENCODER.appendEncoded(uri, query);}if (fragment != null) {uri.append('#');ALL_LEGAL_ENCODER.appendEncoded(uri, fragment);}parseURI(uri.toString(), false);}
public BlameGenerator(Repository repository, String path) {this.repository = repository;this.resultPath = PathFilter.create(path);idBuf = new MutableObjectId();setFollowFileRenames(true);initRevPool(false);remaining = -1;}
public synchronized void writeTo(OutputStream out) throws IOException {out.write(buf, 0, count);}
public DeletableItem(String name, java.util.List<Attribute> attributes) {setName(name);setAttributes(attributes);}
public DescribeGroupResult describeGroup(DescribeGroupRequest request) {request = beforeClientExecution(request);return executeDescribeGroup(request);}
public EnableVpcClassicLinkResult enableVpcClassicLink(EnableVpcClassicLinkRequest request) {request = beforeClientExecution(request);return executeEnableVpcClassicLink(request);}
public DescribeStacksResult describeStacks() {return describeStacks(new DescribeStacksRequest());}
public CharBuffer duplicate() {return copy(this);}
public static double mod(double n, double d) {if (d == 0) {return Double.NaN;}else if (sign(n) == sign(d)) {return n % d;}else {return ((n % d) + d) % d;}}
public static String getLocalizedMessage(String key, Locale locale) {Object message = getResourceBundleObject(key, locale);if (message == null) {return "Message with key:" + key + " and locale: " + locale+ " not found.";}return message.toString();}
public CharSequence toQueryString(EscapeQuerySyntax escapeSyntaxParser) {if (getChild() == null)return "";return getChild().toQueryString(escapeSyntaxParser) + "^"+ getValueString();}
public CharSequence toQueryString(EscapeQuerySyntax escapeSyntaxParser) {if (getChild() == null)return "";return "( " + getChild().toQueryString(escapeSyntaxParser) + " )";}
public GetInvalidationResult getInvalidation(GetInvalidationRequest request) {request = beforeClientExecution(request);return executeGetInvalidation(request);}
public String formatAsString() {return formatAsString(null, false);}
public final int prefixCompare(byte[] bs, int p) {int cmp;cmp = NB.compareUInt32(w1, mask(1, NB.decodeInt32(bs, p)));if (cmp != 0)return cmp;cmp = NB.compareUInt32(w2, mask(2, NB.decodeInt32(bs, p + 4)));if (cmp != 0)return cmp;cmp = NB.compareUInt32(w3, mask(3, NB.decodeInt32(bs, p + 8)));if (cmp != 0)return cmp;cmp = NB.compareUInt32(w4, mask(4, NB.decodeInt32(bs, p + 12)));if (cmp != 0)return cmp;return NB.compareUInt32(w5, mask(5, NB.decodeInt32(bs, p + 16)));}
public AddApplicationInputProcessingConfigurationResult addApplicationInputProcessingConfiguration(AddApplicationInputProcessingConfigurationRequest request) {request = beforeClientExecution(request);return executeAddApplicationInputProcessingConfiguration(request);}
public static TermRangeQuery newStringRange(String field, String lowerTerm, String upperTerm, boolean includeLower, boolean includeUpper) {BytesRef lower = lowerTerm == null ? null : new BytesRef(lowerTerm);BytesRef upper = upperTerm == null ? null : new BytesRef(upperTerm);return new TermRangeQuery(field, lower, upper, includeLower, includeUpper);}
static public double fv(double r, int nper, double pmt, double pv, int type) {return -(pv * Math.pow(1 + r, nper) + pmt * (1+r*type) * (Math.pow(1 + r, nper) - 1) / r);}
public int checkExternSheet(int firstSheetIndex, int lastSheetIndex) {int thisWbIndex = -1; for (int i = 0; i < _externalBookBlocks.length; i++) {SupBookRecord ebr = _externalBookBlocks[i].getExternalBookRecord();if (ebr.isInternalReferences()) {thisWbIndex = i;break;}}if (thisWbIndex < 0) {throw new RuntimeException("Could not find 'internal references' EXTERNALBOOK");}int i = _externSheetRecord.getRefIxForSheet(thisWbIndex, firstSheetIndex, lastSheetIndex);if (i >= 0) {return i;}return _externSheetRecord.addRef(thisWbIndex, firstSheetIndex, lastSheetIndex);}
public DescribeSentimentDetectionJobResult describeSentimentDetectionJob(DescribeSentimentDetectionJobRequest request) {request = beforeClientExecution(request);return executeDescribeSentimentDetectionJob(request);}
public String toString(){StringBuilder buffer = new StringBuilder();buffer.append("[UNITS]\n");buffer.append("    .units                = ").append("0x").append(HexDump.toHex(  getUnits ())).append(" (").append( getUnits() ).append(" )");buffer.append(System.getProperty("line.separator"));buffer.append("[/UNITS]\n");return buffer.toString();}
public NavigableMap<K, V> tailMap(K from, boolean inclusive) {Bound fromBound = inclusive ? INCLUSIVE : EXCLUSIVE;return subMap(from, fromBound, null, NO_BOUND);}
public static int compareTo(Ref o1, Ref o2) {return o1.getName().compareTo(o2.getName());}
public PutEventsConfigurationResult putEventsConfiguration(PutEventsConfigurationRequest request) {request = beforeClientExecution(request);return executePutEventsConfiguration(request);}
public DetachFromIndexResult detachFromIndex(DetachFromIndexRequest request) {request = beforeClientExecution(request);return executeDetachFromIndex(request);}
public RebaseCommand rebase() {return new RebaseCommand(repo);}
public SearchGroup<T> next() {assert iter.hasNext();final SearchGroup<T> group = iter.next();if (group.sortValues == null) {throw new IllegalArgumentException("group.sortValues is null; you must pass fillFields=true to the first pass collector");}return group;}
public UpdateMLModelResult updateMLModel(UpdateMLModelRequest request) {request = beforeClientExecution(request);return executeUpdateMLModel(request);}
public CreateIPSetResult createIPSet(CreateIPSetRequest request) {request = beforeClientExecution(request);return executeCreateIPSet(request);}
public FieldDateResolutionFCListener(QueryConfigHandler config) {this.config = config;}
@Override public boolean containsValue(Object value) {HashMapEntry[] tab = table;int len = tab.length;if (value == null) {for (int i = 0; i < len; i++) {for (HashMapEntry e = tab[i]; e != null; e = e.next) {if (e.value == null) {return true;}}}return entryForNullKey != null && entryForNullKey.value == null;}for (int i = 0; i < len; i++) {for (HashMapEntry e = tab[i]; e != null; e = e.next) {if (value.equals(e.value)) {return true;}}}return entryForNullKey != null && value.equals(entryForNullKey.value);}
public DescribeWorkspaceBundlesResult describeWorkspaceBundles(DescribeWorkspaceBundlesRequest request) {request = beforeClientExecution(request);return executeDescribeWorkspaceBundles(request);}
public PostingsEnum reset(int[] postings) {this.postings = postings;upto = -1;return this;}
public void serialize(LittleEndianOutput out) {out.writeShort(sid); out.writeShort(_reserved0);out.writeInt(_engineId);}
public static CharBuffer allocate(int capacity) {if (capacity < 0) {throw new IllegalArgumentException();}return new ReadWriteCharArrayBuffer(capacity);}
public String toFormulaString(String[] operands) {StringBuilder buffer = new StringBuilder();buffer.append(operands[ 0 ]);buffer.append(">=");buffer.append(operands[ 1 ]);return buffer.toString();}
public DeletePipelineResult deletePipeline(DeletePipelineRequest request) {request = beforeClientExecution(request);return executeDeletePipeline(request);}
public InterfaceHdrRecord(int codePage) {_codepage = codePage;}
public DescribeScalingParametersResult describeScalingParameters(DescribeScalingParametersRequest request) {request = beforeClientExecution(request);return executeDescribeScalingParameters(request);}
public Entry<K, V> higherEntry(K key) {return immutableCopy(findBounded(key, HIGHER));}
public CreateSpotDatafeedSubscriptionRequest(String bucket) {setBucket(bucket);}
public String getLocalizedMessage() {return getLocalizedMessage(Locale.getDefault());}
public UDFFinder getUDFFinder(){return _uBook.getUDFFinder();}
public ExternalName getExternalName(String nameName, String sheetName, int externalWorkbookNumber) {throw new IllegalStateException("XSSF-style external names are not supported for HSSF");}
public OldFormulaRecord(RecordInputStream ris) {super(ris, ris.getSid() == biff2_sid);if (isBiff2()) {field_4_value = ris.readDouble();} else {long valueLongBits  = ris.readLong();specialCachedValue = FormulaSpecialCachedValue.create(valueLongBits);if (specialCachedValue == null) {field_4_value = Double.longBitsToDouble(valueLongBits);}}if (isBiff2()) {field_5_options = (short)ris.readUByte();} else {field_5_options = ris.readShort();}int expression_len = ris.readShort();int nBytesAvailable = ris.available();field_6_parsed_expr = Formula.read(expression_len, ris, nBytesAvailable);}
public int stem(char s[], int len) {assert s.length >= len + 1 : "this stemmer requires an oversized array of at least 1";len = plural.apply(s, len);len = unification.apply(s, len);len = adverb.apply(s, len);int oldlen;do {oldlen = len;len = augmentative.apply(s, len);} while (len != oldlen);oldlen = len;len = noun.apply(s, len);if (len == oldlen) { len = verb.apply(s, len);}len = vowel.apply(s, len);for (int i = 0; i < len; i++)switch(s[i]) {case 'á': s[i] = 'a'; break;case 'é':case 'ê': s[i] = 'e'; break;case 'í': s[i] = 'i'; break;case 'ó': s[i] = 'o'; break;case 'ú': s[i] = 'u'; break;}return len;}
public boolean sameProperties(FontRecord other) {returnfield_1_font_height         == other.field_1_font_height &&field_2_attributes          == other.field_2_attributes &&field_3_color_palette_index == other.field_3_color_palette_index &&field_4_bold_weight         == other.field_4_bold_weight &&field_5_super_sub_script    == other.field_5_super_sub_script &&field_6_underline           == other.field_6_underline &&field_7_family              == other.field_7_family &&field_8_charset             == other.field_8_charset &&field_9_zero                == other.field_9_zero &&Objects.equals(this.field_11_font_name, other.field_11_font_name);}
public String toFormulaString() {return FormulaError.REF.getString();}
public StartTextDetectionResult startTextDetection(StartTextDetectionRequest request) {request = beforeClientExecution(request);return executeStartTextDetection(request);}
public DeleteMessageBatchRequestEntry(String id, String receiptHandle) {setId(id);setReceiptHandle(receiptHandle);}
public PatternCaptureGroupTokenFilter create(TokenStream input) {return new PatternCaptureGroupTokenFilter(input, preserveOriginal, pattern);}
public SigningCertificate(String userName, String certificateId, String certificateBody, StatusType status) {setUserName(userName);setCertificateId(certificateId);setCertificateBody(certificateBody);setStatus(status.toString());}
public DistributionConfig(String callerReference, Boolean enabled) {setCallerReference(callerReference);setEnabled(enabled);}
public FastCharStream(Reader r) {input = r;}
public int end(int group) {ensureMatch();return matchOffsets[(group * 2) + 1];}
public final Map.Entry<K, V> next() { return nextEntry(); }
public BlameCommand setTextComparator(RawTextComparator textComparator) {this.textComparator = textComparator;return this;}
public final T pop() {if (size > 0) {T result = heap[1];       heap[1] = heap[size];     heap[size] = null;        size--;downHeap(1);              return result;} else {return null;}}
public String toString() {return getClass().getSimpleName() + "(fields=" + fields.size() + ",delegate=" + postingsReader + ")";}
public static String shortenRefName(String noteRefName) {if (noteRefName.startsWith(Constants.R_NOTES))return noteRefName.substring(Constants.R_NOTES.length());return noteRefName;}
public DescribeDomainsResult describeDomains() {return describeDomains(new DescribeDomainsRequest());}
public int available() {return ccis.available();}
public GetContentModerationResult getContentModeration(GetContentModerationRequest request) {request = beforeClientExecution(request);return executeGetContentModeration(request);}
public PrintStream(OutputStream out) {super(out);if (out == null) {throw new NullPointerException();}}
public long ramBytesUsed() {long ramBytesUsed = postingsReader.ramBytesUsed();for (TermsReader r : fields.values()) {ramBytesUsed += r.ramBytesUsed();}return ramBytesUsed;}
public GetIntegrationResult getIntegration(GetIntegrationRequest request) {request = beforeClientExecution(request);return executeGetIntegration(request);}
public void setVisibility(int v) {if (getVisibility() != v) {super.setVisibility(v);if (mIndeterminate) {if (v == GONE || v == INVISIBLE) {stopAnimation();} else {startAnimation();}}}}
public boolean matches(char s[], int len) {if (!super.matches(s, len))return false;for (int i = 0; i < exceptions.length; i++)if (endsWith(s, len, exceptions[i]))return false;return true;}
public DescribeFleetCapacityResult describeFleetCapacity(DescribeFleetCapacityRequest request) {request = beforeClientExecution(request);return executeDescribeFleetCapacity(request);}
public UploadPackInternalServerErrorException(Throwable why) {initCause(why);}
public GetNetworkResult getNetwork(GetNetworkRequest request) {request = beforeClientExecution(request);return executeGetNetwork(request);}
public AllocatePrivateVirtualInterfaceResult allocatePrivateVirtualInterface(AllocatePrivateVirtualInterfaceRequest request) {request = beforeClientExecution(request);return executeAllocatePrivateVirtualInterface(request);}
public GetDeploymentResult getDeployment(GetDeploymentRequest request) {request = beforeClientExecution(request);return executeGetDeployment(request);}
public UpdateRepoAuthorizationRequest() {super("cr", "2016-06-07", "UpdateRepoAuthorization", "cr");setUriPattern("/repos/[RepoNamespace]/[RepoName]/authorizations/[AuthorizeId]");setMethod(MethodType.POST);}
public void foldToASCII(char[] input, int length){final int maxSizeNeeded = 4 * length;if (output.length < maxSizeNeeded) {output = new char[ArrayUtil.oversize(maxSizeNeeded, Character.BYTES)];}outputPos = foldToASCII(input, 0, output, 0, length);if (preserveOriginal && needToPreserve(input, length)) {state = captureState();}}
public boolean hasEntry(String name) {if (excludes.contains(name)) {return false;}return directory.hasEntry(name);}
public void setLockMessage(String msg) {lockMessage = msg;}
public ReflogCommand reflog() {return new ReflogCommand(repo);}
public void serialize(LittleEndianOutput out) {out.writeShort(getFirstRow());out.writeShort(getLastRow());out.writeShort(getFirstColumn());out.writeShort(getLastColumn());}
public static int response(java.net.HttpURLConnection c)throws IOException {try {return c.getResponseCode();} catch (ConnectException ce) {final URL url = c.getURL();final String host = (url == null) ? "<null>" : url.getHost(); if ("Connection timed out: connect".equals(ce.getMessage())) throw new ConnectException(MessageFormat.format(JGitText.get().connectionTimeOut, host));throw new ConnectException(ce.getMessage() + " " + host); }}
public static void fill(long[] array, long value) {for (int i = 0; i < array.length; i++) {array[i] = value;}}
public void serialize(LittleEndianOutput out) {out.writeInt(getPositionOfBof());out.writeShort(field_2_option_flags);String name = field_5_sheetname;out.writeByte(name.length());out.writeByte(field_4_isMultibyteUnicode);if (isMultibyte()) {StringUtil.putUnicodeLE(name, out);} else {StringUtil.putCompressedUnicode(name, out);}}
public static String getNonBlankTextOrFail(Element e) throws ParserException {String v = getText(e);if (null != v)v = v.trim();if (null == v || 0 == v.length()) {throw new ParserException(e.getTagName() + " has no text");}return v;}
public void buildFieldConfig(FieldConfig fieldConfig) {Map<String, Float> fieldBoostMap = this.config.get(ConfigurationKeys.FIELD_BOOST_MAP);if (fieldBoostMap != null) {Float boost = fieldBoostMap.get(fieldConfig.getField());if (boost != null) {fieldConfig.set(ConfigurationKeys.BOOST, boost);}}}
public PutLifecyclePolicyResult putLifecyclePolicy(PutLifecyclePolicyRequest request) {request = beforeClientExecution(request);return executePutLifecyclePolicy(request);}
public SortedSet<E> subSet(E start, E end) {return subSet(start, true, end, false);}
public void setParams(String params) {super.setParams(params);if (params != null) {int multiplier;if (params.endsWith("s")) {multiplier = 1;params = params.substring(0, params.length()-1);} else if (params.endsWith("m")) {multiplier = 60;params = params.substring(0, params.length()-1);} else if (params.endsWith("h")) {multiplier = 3600;params = params.substring(0, params.length()-1);} else {multiplier = 1;}waitTimeSec = Double.parseDouble(params) * multiplier;} else {throw new IllegalArgumentException("you must specify the wait time, eg: 10.0s, 4.5m, 2h");}}
public PutAttributesRequest(String domainName, String itemName, java.util.List<ReplaceableAttribute> attributes, UpdateCondition expected) {setDomainName(domainName);setItemName(itemName);setAttributes(attributes);setExpected(expected);}
public DescribeStreamConsumerResult describeStreamConsumer(DescribeStreamConsumerRequest request) {request = beforeClientExecution(request);return executeDescribeStreamConsumer(request);}
public void freeze() {this.frozen = true;}
public FuzzyLikeThisQueryBuilder(Analyzer analyzer) {this.analyzer = analyzer;}
public DBClusterSnapshot copyDBClusterSnapshot(CopyDBClusterSnapshotRequest request) {request = beforeClientExecution(request);return executeCopyDBClusterSnapshot(request);}
public OutputStreamDataOutput(OutputStream os) {this.os = os;}
public String findPattern(String pat) {int k = super.find(pat);if (k >= 0) {return unpackValues(k);}return "";}
public static int murmurhash3_x86_32(BytesRef bytes, int seed) {return murmurhash3_x86_32(bytes.bytes, bytes.offset, bytes.length, seed);}
public boolean isOverridable() {return overridable;}
public UpdateMemberResult updateMember(UpdateMemberRequest request) {request = beforeClientExecution(request);return executeUpdateMember(request);}
public CopyFpgaImageResult copyFpgaImage(CopyFpgaImageRequest request) {request = beforeClientExecution(request);return executeCopyFpgaImage(request);}
public void inform(ResourceLoader loader) {try { OpenNLPOpsFactory.getPOSTaggerModel(posTaggerModelFile, loader);} catch (IOException e) {throw new IllegalArgumentException(e);}}
public CellRangeAddress(int firstRow, int lastRow, int firstCol, int lastCol) {super(firstRow, lastRow, firstCol, lastCol);if (lastRow < firstRow || lastCol < firstCol) {throw new IllegalArgumentException("Invalid cell range, having lastRow < firstRow || lastCol < firstCol, " +"had rows " + lastRow + " >= " + firstRow + " or cells " + lastCol + " >= " + firstCol);}}
public boolean equals(ATNConfig a, ATNConfig b) {if ( a==b ) return true;if ( a==null || b==null ) return false;return a.state.stateNumber==b.state.stateNumber&& a.context.equals(b.context);}
public PushCommand setPushTags() {refSpecs.add(Transport.REFSPEC_TAGS);return this;}
public CreateEvaluationResult createEvaluation(CreateEvaluationRequest request) {request = beforeClientExecution(request);return executeCreateEvaluation(request);}
public DescribeOrderableDBInstanceOptionsResult describeOrderableDBInstanceOptions(DescribeOrderableDBInstanceOptionsRequest request) {request = beforeClientExecution(request);return executeDescribeOrderableDBInstanceOptions(request);}
public long getPosition() {return (long) currentBlockIndex * blockSize + currentBlockUpto;}
public TokenStream create(TokenStream input) {return new FrenchLightStemFilter(input);}
public AssignPrivateIpAddressesResult assignPrivateIpAddresses(AssignPrivateIpAddressesRequest request) {request = beforeClientExecution(request);return executeAssignPrivateIpAddresses(request);}
public boolean setExecute(File f, boolean canExec) {return false;}
public ValueEval evaluate(int srcRowIndex, int srcColumnIndex, ValueEval lookup_value, ValueEval table_array,ValueEval col_index, ValueEval range_lookup) {try {ValueEval lookupValue = OperandResolver.getSingleValue(lookup_value, srcRowIndex, srcColumnIndex);TwoDEval tableArray = LookupUtils.resolveTableArrayArg(table_array);boolean isRangeLookup;try {isRangeLookup = LookupUtils.resolveRangeLookupArg(range_lookup, srcRowIndex, srcColumnIndex);} catch(RuntimeException e) {isRangeLookup = true;}int rowIndex = LookupUtils.lookupIndexOfValue(lookupValue, LookupUtils.createColumnVector(tableArray, 0), isRangeLookup);int colIndex = LookupUtils.resolveRowOrColIndexArg(col_index, srcRowIndex, srcColumnIndex);ValueVector resultCol = createResultColumnVector(tableArray, colIndex);return resultCol.getItem(rowIndex);} catch (EvaluationException e) {return e.getErrorEval();}}
public CreateGameSessionResult createGameSession(CreateGameSessionRequest request) {request = beforeClientExecution(request);return executeCreateGameSession(request);}
public RowRecord getRow(int rowIndex) {int maxrow = SpreadsheetVersion.EXCEL97.getLastRowIndex();if (rowIndex < 0 || rowIndex > maxrow) {throw new IllegalArgumentException("The row number must be between 0 and " + maxrow + ", but had: " + rowIndex);}return _rowRecords.get(Integer.valueOf(rowIndex));}
public DescribeClientPropertiesResult describeClientProperties(DescribeClientPropertiesRequest request) {request = beforeClientExecution(request);return executeDescribeClientProperties(request);}
public Builder(CompositeReader reader) {this.reader = reader;}
public synchronized void mark(int readlimit) {in.mark(readlimit);}
public void print(int inum) {print(String.valueOf(inum));}
public static final ObjectId fromRaw(int[] is) {return fromRaw(is, 0);}
public String toString() {return slice.toString()+":"+ postingsEnum;}
public void serialize(LittleEndianOutput out) {out.writeShort(getMode());}
@Override public int size() {return Impl.this.size();}
public static int hashCode(Object... objects) {return Arrays.hashCode(objects);}
public ByteBuffer putFloat(int index, float value) {throw new ReadOnlyBufferException();}
public ListJournalS3ExportsForLedgerResult listJournalS3ExportsForLedger(ListJournalS3ExportsForLedgerRequest request) {request = beforeClientExecution(request);return executeListJournalS3ExportsForLedger(request);}
public DeleteMessageBatchResult deleteMessageBatch(DeleteMessageBatchRequest request) {request = beforeClientExecution(request);return executeDeleteMessageBatch(request);}
public final void write(LittleEndianOutput out) {out.writeByte(getSid() + getPtgClass());writeCoordinates(out);}
public FSTCompletionBuilder(int buckets, BytesRefSorter sorter, int shareMaxTailLength) {if (buckets < 1 || buckets > 255) {throw new IllegalArgumentException("Buckets must be >= 1 and <= 255: "+ buckets);}if (sorter == null) throw new IllegalArgumentException("BytesRefSorter must not be null.");this.sorter = sorter;this.buckets = buckets;this.shareMaxTailLength = shareMaxTailLength;}
public void incRef() {refCount.incrementAndGet();}
public boolean supports(CredentialItem... items) {for (CredentialItem i : items) {if (i instanceof CredentialItem.Username)continue;else if (i instanceof CredentialItem.Password)continue;else return false;}return true;}
public DeleteVpnConnectionRequest(String vpnConnectionId) {setVpnConnectionId(vpnConnectionId);}
public final ValueEval evaluate(ValueEval[] args, int srcRowIndex, int srcColumnIndex) {if (args.length != 4) {return ErrorEval.VALUE_INVALID;}return evaluate(srcRowIndex, srcColumnIndex, args[0], args[1], args[2], args[3]);}
public void print(double d) {print(String.valueOf(d));}
public UpdateUserProfileResult updateUserProfile(UpdateUserProfileRequest request) {request = beforeClientExecution(request);return executeUpdateUserProfile(request);}
public RevFilter clone() {final RevFilter[] s = new RevFilter[subfilters.length];for (int i = 0; i < s.length; i++)s[i] = subfilters[i].clone();return new List(s);}
public GetFederationTokenRequest(String name) {setName(name);}
public static Cell translateUnicodeValues(Cell cell) {String s = cell.getRichStringCellValue().getString();boolean foundUnicode = false;String lowerCaseStr = s.toLowerCase(Locale.ROOT);for (UnicodeMapping entry : unicodeMappings) {String key = entry.entityName;if (lowerCaseStr.contains(key)) {s = s.replaceAll(key, entry.resolvedValue);foundUnicode = true;}}if (foundUnicode) {cell.setCellValue(cell.getRow().getSheet().getWorkbook().getCreationHelper().createRichTextString(s));}return cell;}
public CreateChangeSetResult createChangeSet(CreateChangeSetRequest request) {request = beforeClientExecution(request);return executeCreateChangeSet(request);}
public SubmoduleStatusCommand(Repository repo) {super(repo);paths = new ArrayList<>();}
public int getResultStart() {return outRegion.resultStart;}
public static BigInteger round(BigInteger bi, int nBits) {if (nBits < 1) {return bi;}return bi.add(HALF_BITS[nBits]);}
public static Date round(Date date, Resolution resolution) {return new Date(round(date.getTime(), resolution));}
public static int compareArrayByPrefix(char[] shortArray, int shortIndex,char[] longArray, int longIndex) {if (shortArray == null)return 0;else if (longArray == null)return (shortIndex < shortArray.length) ? 1 : 0;int si = shortIndex, li = longIndex;while (si < shortArray.length && li < longArray.length&& shortArray[si] == longArray[li]) {si++;li++;}if (si == shortArray.length) {return 0;} else {if (li == longArray.length)return 1;else return (shortArray[si] > longArray[li]) ? 1 : -1;}}
public AttachInternetGatewayResult attachInternetGateway(AttachInternetGatewayRequest request) {request = beforeClientExecution(request);return executeAttachInternetGateway(request);}
public synchronized boolean containsValue(Object value) {if (value == null) {throw new NullPointerException();}HashtableEntry[] tab = table;int len = tab.length;for (int i = 0; i < len; i++) {for (HashtableEntry e = tab[i]; e != null; e = e.next) {if (value.equals(e.value)) {return true;}}}return false;}
public String toFormulaString(String[] operands) {StringBuilder buffer = new StringBuilder();buffer.append( operands[0] );buffer.append("<=");buffer.append( operands[1] );return buffer.toString();}
public void write(String str) {write(str.toCharArray());}
public Sort(SortField... fields) {setSort(fields);}
public DescribeEventCategoriesResult describeEventCategories(DescribeEventCategoriesRequest request) {request = beforeClientExecution(request);return executeDescribeEventCategories(request);}
public UpdateDeviceResult updateDevice(UpdateDeviceRequest request) {request = beforeClientExecution(request);return executeUpdateDevice(request);}
public CreateWorkerBlockResult createWorkerBlock(CreateWorkerBlockRequest request) {request = beforeClientExecution(request);return executeCreateWorkerBlock(request);}
public synchronized void reset() throws IOException {throw new IOException();}
public final void setReader(Reader input) {if (input == null) {throw new NullPointerException("input must not be null");} else if (this.input != ILLEGAL_STATE_READER) {throw new IllegalStateException("TokenStream contract violation: close() call missing");}this.inputPending = input;setReaderTestPoint();}
public GetUsagePlanKeysResult getUsagePlanKeys(GetUsagePlanKeysRequest request) {request = beforeClientExecution(request);return executeGetUsagePlanKeys(request);}
public String toString(){StringBuilder sb = new StringBuilder();sb.append( "subInfos=(" );for( SubInfo si : subInfos )sb.append( si.toString() );sb.append( ")/" ).append( totalBoost ).append( '(' ).append( startOffset ).append( ',' ).append( endOffset ).append( ')' );return sb.toString();}
public TokenStream create(TokenStream input) {return new LimitTokenPositionFilter(input, maxTokenPosition, consumeAllTokens);}
public DescribeFleetUtilizationResult describeFleetUtilization(DescribeFleetUtilizationRequest request) {request = beforeClientExecution(request);return executeDescribeFleetUtilization(request);}
public void inform(ResourceLoader loader) throws IOException {InputStream stream = null;try {if (dictFile != null) dictionary = getWordSet(loader, dictFile, false);stream = loader.openResource(hypFile);final InputSource is = new InputSource(stream);is.setEncoding(encoding); is.setSystemId(hypFile);hyphenator = HyphenationCompoundWordTokenFilter.getHyphenationTree(is);} finally {IOUtils.closeWhileHandlingException(stream);}}
public DeclineInvitationsResult declineInvitations(DeclineInvitationsRequest request) {request = beforeClientExecution(request);return executeDeclineInvitations(request);}
public DescribeAutoScalingGroupsResult describeAutoScalingGroups() {return describeAutoScalingGroups(new DescribeAutoScalingGroupsRequest());}
public String toString() {return String.format("pushMode(%d)", mode);}
public CreateBranchCommand setStartPoint(String startPoint) {checkCallable();this.startPoint = startPoint;this.startCommit = null;return this;}
public DBInstance stopDBInstance(StopDBInstanceRequest request) {request = beforeClientExecution(request);return executeStopDBInstance(request);}
public SuggestWordQueue(int size, Comparator<SuggestWord> comparator){super(size);this.comparator = comparator;}
public LBCookieStickinessPolicy(String policyName, Long cookieExpirationPeriod) {setPolicyName(policyName);setCookieExpirationPeriod(cookieExpirationPeriod);}
public SheetRangeEvaluator(int firstSheetIndex, int lastSheetIndex, SheetRefEvaluator[] sheetEvaluators) {if (firstSheetIndex < 0) {throw new IllegalArgumentException("Invalid firstSheetIndex: " + firstSheetIndex + ".");}if (lastSheetIndex < firstSheetIndex) {throw new IllegalArgumentException("Invalid lastSheetIndex: " + lastSheetIndex + " for firstSheetIndex: " + firstSheetIndex + ".");}_firstSheetIndex = firstSheetIndex;_lastSheetIndex = lastSheetIndex;_sheetEvaluators = sheetEvaluators.clone();}
public RevokeTokenRequest() {super("OnsMqtt", "2019-12-11", "RevokeToken", "onsmqtt");setMethod(MethodType.POST);}
public ValueEval evaluate(int srcRowIndex, int srcColumnIndex, ValueEval arg0, ValueEval arg1) {try {ValueEval ve = OperandResolver.getSingleValue(arg0, srcRowIndex, srcColumnIndex);double result = OperandResolver.coerceValueToDouble(ve);if (Double.isNaN(result) || Double.isInfinite(result)) {throw new EvaluationException(ErrorEval.NUM_ERROR);}if (arg1 instanceof RefListEval) {return eval(result, ((RefListEval)arg1), true);}final AreaEval aeRange = convertRangeArg(arg1);return eval(result, aeRange, true);} catch (EvaluationException e) {return e.getErrorEval();}}
public String toFormulaString() {return "";}
public byte readByte() throws IOException {if (bufferPos == bufferSize) {refill();}assert bufferPos == buffer.position() : "bufferPos=" + bufferPos + " vs buffer.position()=" + buffer.position();bufferPos++;return buffer.get();}
public ListTargetsByRuleResult listTargetsByRule(ListTargetsByRuleRequest request) {request = beforeClientExecution(request);return executeListTargetsByRule(request);}
public DisassociateQualificationFromWorkerResult disassociateQualificationFromWorker(DisassociateQualificationFromWorkerRequest request) {request = beforeClientExecution(request);return executeDisassociateQualificationFromWorker(request);}
public boolean equals(Object obj) {if (this == obj) return true;if (obj == null) return false;if (getClass() != obj.getClass()) return false;CompiledAutomaton other = (CompiledAutomaton) obj;if (type != other.type) return false;if (type == AUTOMATON_TYPE.SINGLE) {if (!term.equals(other.term)) return false;} else if (type == AUTOMATON_TYPE.NORMAL) {if (!runAutomaton.equals(other.runAutomaton)) return false;}return true;}
public static CharFilterFactory forName(String name, Map<String,String> args) {return loader.newInstance(name, args);}
public String toString() {String[] units = { "bytes", "KiB", "MiB", "GiB" };long sz = getIndexSize();int u = 0;while (1024 <= sz && u < units.length - 1) {int rem = (int) (sz % 1024);sz /= 1024;if (rem != 0)sz++;u++;}return "DeltaIndex[" + sz + " " + units[u] + "]";}
public SimilarityConfig build() {return new SimilarityConfig(this);}
public void mark(int readLimit) throws IOException {throw new IOException();}
public void collect(int doc) throws IOException {final long time = clock.get();if (time - timeout > 0L) {if (greedy) {in.collect(doc);}throw new TimeExceededException( timeout-t0, time-t0, docBase + doc );}in.collect(doc);}
public LocalFile(File directory, int inCoreLimit) {super(inCoreLimit);this.directory = directory;}
@Override public E remove(int index) {Object[] a = array;int s = size;if (index >= s) {throwIndexOutOfBoundsException(index, s);}@SuppressWarnings("unchecked") E result = (E) a[index];System.arraycopy(a, index + 1, a, index, --s - index);a[s] = null;  size = s;modCount++;return result;}
public RequestUploadCredentialsResult requestUploadCredentials(RequestUploadCredentialsRequest request) {request = beforeClientExecution(request);return executeRequestUploadCredentials(request);}
public void copyTo(OutputStream out) throws MissingObjectException,IOException {if (isLarge()) {try (ObjectStream in = openStream()) {final long sz = in.getSize();byte[] tmp = new byte[8192];long copied = 0;while (copied < sz) {int n = in.read(tmp);if (n < 0)throw new EOFException();out.write(tmp, 0, n);copied += n;}if (0 <= in.read())throw new EOFException();}} else {out.write(getCachedBytes());}}
@Override public V remove(Object key) {if (key == null) {return removeNullKey();}int hash = secondaryHash(key.hashCode());HashMapEntry<K, V>[] tab = table;int index = hash & (tab.length - 1);for (HashMapEntry<K, V> e = tab[index], prev = null;e != null; prev = e, e = e.next) {if (e.hash == hash && key.equals(e.key)) {if (prev == null) {tab[index] = e.next;} else {prev.next = e.next;}modCount++;size--;postRemove(e);return e.value;}}return null;}
public RevFilter negate() {return a;}
public DescribeVpcsResult describeVpcs(DescribeVpcsRequest request) {request = beforeClientExecution(request);return executeDescribeVpcs(request);}
public UpdateGameSessionQueueResult updateGameSessionQueue(UpdateGameSessionQueueRequest request) {request = beforeClientExecution(request);return executeUpdateGameSessionQueue(request);}
public String getTitle() {return title;}
public final void setNewHeads(List<Head> newHeads) {if (this.newHeads != null)throw new IllegalStateException(JGitText.get().propertyIsAlreadyNonNull);this.newHeads = newHeads;}
public ObjectId getExpectedOldObjectId() {return expectedOldObjectId;}
public GetRecordsResult getRecords(GetRecordsRequest request) {request = beforeClientExecution(request);return executeGetRecords(request);}
public Deleted3DPxg(int externalWorkbookNumber, String sheetName) {this.externalWorkbookNumber = externalWorkbookNumber;this.sheetName = sheetName;}
public void execute(Lexer lexer) {lexer.skip();}
public DescribeScheduledInstancesResult describeScheduledInstances(DescribeScheduledInstancesRequest request) {request = beforeClientExecution(request);return executeDescribeScheduledInstances(request);}
public MultiFields(Fields[] subs, ReaderSlice[] subSlices) {this.subs = subs;this.subSlices = subSlices;}
public int peekNextSid() {if(!hasNext()) {return -1;}return _list.get(_nextIndex).getSid();}
public ConfigureAgentResult configureAgent(ConfigureAgentRequest request) {request = beforeClientExecution(request);return executeConfigureAgent(request);}
public GetStreamingDistributionResult getStreamingDistribution(GetStreamingDistributionRequest request) {request = beforeClientExecution(request);return executeGetStreamingDistribution(request);}
public ListTrialComponentsResult listTrialComponents(ListTrialComponentsRequest request) {request = beforeClientExecution(request);return executeListTrialComponents(request);}
public ByteBuffer putShort(int index, short value) {throw new ReadOnlyBufferException();}
public int compareNormalised(NormalisedDecimal other) {int cmp = _relativeDecimalExponent - other._relativeDecimalExponent;if (cmp != 0) {return cmp;}if (_wholePart > other._wholePart) {return 1;}if (_wholePart < other._wholePart) {return -1;}return _fractionalPart - other._fractionalPart;}
public TokenStream create(TokenStream input) {return new JapaneseKatakanaStemFilter(input, minimumLength);}
public EnableAvailabilityZonesForLoadBalancerResult enableAvailabilityZonesForLoadBalancer(EnableAvailabilityZonesForLoadBalancerRequest request) {request = beforeClientExecution(request);return executeEnableAvailabilityZonesForLoadBalancer(request);}
public UpdateEnvironmentResult updateEnvironment(UpdateEnvironmentRequest request) {request = beforeClientExecution(request);return executeUpdateEnvironment(request);}
public ListTagsForDomainResult listTagsForDomain(ListTagsForDomainRequest request) {request = beforeClientExecution(request);return executeListTagsForDomain(request);}
public static double log(double base, double x) {return Math.log(x) / Math.log(base);}
public final void writeBoolean(boolean val) throws IOException {out.write(val ? 1 : 0);written++;}
public boolean equals(Object other) {if (!(other instanceof ByteBuffer)) {return false;}ByteBuffer otherBuffer = (ByteBuffer) other;if (remaining() != otherBuffer.remaining()) {return false;}int myPosition = position;int otherPosition = otherBuffer.position;boolean equalSoFar = true;while (equalSoFar && (myPosition < limit)) {equalSoFar = get(myPosition++) == otherBuffer.get(otherPosition++);}return equalSoFar;}
public DescribeVirtualGatewaysResult describeVirtualGateways() {return describeVirtualGateways(new DescribeVirtualGatewaysRequest());}
public FieldConfig getFieldConfig(String fieldName) {FieldConfig fieldConfig = new FieldConfig(StringUtils.toString(fieldName));for (FieldConfigListener listener : this.listeners) {listener.buildFieldConfig(fieldConfig);}return fieldConfig;}
public void setProperty(Row row, int column) {Cell cell = CellUtil.getCell(row, column);CellUtil.setCellStyleProperty(cell, _propertyName, _propertyValue);}
public RebootInstancesResult rebootInstances(RebootInstancesRequest request) {request = beforeClientExecution(request);return executeRebootInstances(request);}
public Predicate(int ruleIndex, int predIndex, boolean isCtxDependent) {this.ruleIndex = ruleIndex;this.predIndex = predIndex;this.isCtxDependent = isCtxDependent;}
public void fillPolygon(int[] xPoints, int[] yPoints,int nPoints){int right  = findBiggest(xPoints);int bottom = findBiggest(yPoints);int left   = findSmallest(xPoints);int top    = findSmallest(yPoints);HSSFPolygon shape = escherGroup.createPolygon(new HSSFChildAnchor(left,top,right,bottom) );shape.setPolygonDrawArea(right - left, bottom - top);shape.setPoints(addToAll(xPoints, -left), addToAll(yPoints, -top));shape.setLineStyleColor(foreground.getRed(), foreground.getGreen(), foreground.getBlue());shape.setFillColor(foreground.getRed(), foreground.getGreen(), foreground.getBlue());}
public ListEventsRequest() {super("Status", "2020-01-17", "ListEvents", "StatusAPI");setMethod(MethodType.POST);}
public ListIAMPolicyAssignmentsResult listIAMPolicyAssignments(ListIAMPolicyAssignmentsRequest request) {request = beforeClientExecution(request);return executeListIAMPolicyAssignments(request);}
public CountingOutputStream(OutputStream out) {this.out = out;}
public void seekExact(BytesRef target, TermState otherState) {if (!target.equals(term)) {state.copyFrom(otherState);term = BytesRef.deepCopyOf(target);seekPending = true;}}
public void seek(long pos) throws IOException {if (pos != getFilePointer()) {final long alignedPos = pos & ALIGN_NOT_MASK;filePos = alignedPos-bufferSize;final int delta = (int) (pos - alignedPos);if (delta != 0) {refill();buffer.position(delta);bufferPos = delta;} else {bufferPos = bufferSize;}}}
public void clear() {removeAllElements();}
public QueryCustomerByPhoneRequest() {super("xspace", "2017-07-20", "QueryCustomerByPhone");setUriPattern("/customerbyphone");setMethod(MethodType.POST);}
public ValueEval evaluate(int srcRowIndex, int srcColumnIndex, ValueEval arg0) {return this.evaluate(srcRowIndex, srcColumnIndex, arg0, null);}
public ListDashboardVersionsResult listDashboardVersions(ListDashboardVersionsRequest request) {request = beforeClientExecution(request);return executeListDashboardVersions(request);}
public IntBuffer put(int c) {if (position == limit) {throw new BufferOverflowException();}backingArray[offset + position++] = c;return this;}
public DeleteHostedZoneResult deleteHostedZone(DeleteHostedZoneRequest request) {request = beforeClientExecution(request);return executeDeleteHostedZone(request);}
public CreateReceiptRuleResult createReceiptRule(CreateReceiptRuleRequest request) {request = beforeClientExecution(request);return executeCreateReceiptRule(request);}
public Result rename() throws IOException {try {result = doRename();return result;} catch (IOException err) {result = Result.IO_FAILURE;throw err;}}
public DescribeDBInstancesResult describeDBInstances() {return describeDBInstances(new DescribeDBInstancesRequest());}
public String toString() {if (label != null) {return label + ":" + tag;}return tag;}
public CharSequence toQueryString(EscapeQuerySyntax escaper) {return "[DELETEDCHILD]";}
public CreateAccountResult createAccount(CreateAccountRequest request) {request = beforeClientExecution(request);return executeCreateAccount(request);}
public Map.Entry<K,V> next() {HashEntry<K,V> e = super.nextEntry();return new WriteThroughEntry(e.key, e.value);}
public BaseRef(RefEval re) {_refEval = re;_areaEval = null;_firstRowIndex = re.getRow();_firstColumnIndex = re.getColumn();_height = 1;_width = 1;}
public void decode(long[] blocks, int blocksOffset, long[] values, int valuesOffset, int iterations) {for (int i = 0; i < iterations; ++i) {final long block = blocks[blocksOffset++];for (int shift = 62; shift >= 0; shift -= 2) {values[valuesOffset++] = (block >>> shift) & 3;}}}
public void unrollRecursionContexts(ParserRuleContext _parentctx) {_precedenceStack.pop();_ctx.stop = _input.LT(-1);ParserRuleContext retctx = _ctx; if ( _parseListeners != null ) {while ( _ctx != _parentctx ) {triggerExitRuleEvent();_ctx = (ParserRuleContext)_ctx.parent;}}else {_ctx = _parentctx;}retctx.parent = _parentctx;if (_buildParseTrees && _parentctx != null) {_parentctx.addChild(retctx);}}
public CancelBundleTaskRequest(String bundleId) {setBundleId(bundleId);}
public void add(CharsRef input, CharsRef output, boolean includeOrig) {add(input, countWords(input), output, countWords(output), includeOrig);}
public SetIdentityDkimEnabledResult setIdentityDkimEnabled(SetIdentityDkimEnabledRequest request) {request = beforeClientExecution(request);return executeSetIdentityDkimEnabled(request);}
public GetResolverEndpointResult getResolverEndpoint(GetResolverEndpointRequest request) {request = beforeClientExecution(request);return executeGetResolverEndpoint(request);}
public void setText(String value) {string = value;start = offset = 0;end = value.length();}
public String toString() {return toString(0);}
public void adjustIndex(int offset) {_firstSheetIndex += offset;_lastSheetIndex += offset;}
public GalicianStemFilterFactory(Map<String,String> args) {super(args);if (!args.isEmpty()) {throw new IllegalArgumentException("Unknown parameters: " + args);}}
public ListRepositoryAssociationsResult listRepositoryAssociations(ListRepositoryAssociationsRequest request) {request = beforeClientExecution(request);return executeListRepositoryAssociations(request);}
public void setParams(String params) {super.setParams(params);maxNumSegments = (int)Double.parseDouble(params);}
public char getChar() {return (char) getShort();}
public void next(int delta) {if (delta == 1) {prevPtr = currPtr;currPtr = nextPtr;if (!eof())parseEntry();return;}final int end = raw.length;int ptr = nextPtr;while (--delta > 0 && ptr != end) {prevPtr = ptr;while (raw[ptr] != 0)ptr++;ptr += OBJECT_ID_LENGTH + 1;}if (delta != 0)throw new ArrayIndexOutOfBoundsException(delta);currPtr = ptr;if (!eof())parseEntry();}
public Type getType() {return type;}
public CharBuffer duplicate() {return copy(this, mark);}
public NGramFilterFactory(Map<String, String> args) {super(args);minGramSize = requireInt(args, "minGramSize");maxGramSize = requireInt(args, "maxGramSize");preserveOriginal = getBoolean(args, "preserveOriginal", NGramTokenFilter.DEFAULT_PRESERVE_ORIGINAL);if (!args.isEmpty()) {throw new IllegalArgumentException("Unknown parameters: " + args);}}
public AddRoleToDBClusterResult addRoleToDBCluster(AddRoleToDBClusterRequest request) {request = beforeClientExecution(request);return executeAddRoleToDBCluster(request);}
public BlameGenerator setTextComparator(RawTextComparator comparator) {textComparator = comparator;return this;}
public  PatternCaptureGroupFilterFactory(Map<String,String> args) {super(args);pattern = getPattern(args, "pattern");preserveOriginal = args.containsKey("preserve_original") ? Boolean.parseBoolean(args.get("preserve_original")) : true;}
public CreateObjectResult createObject(CreateObjectRequest request) {request = beforeClientExecution(request);return executeCreateObject(request);}
@Override public String getActions() { return null; }
public void onChanged() {if (mAdapter != null) {post(new Runnable());}}
public CreateResourceGroupResult createResourceGroup(CreateResourceGroupRequest request) {request = beforeClientExecution(request);return executeCreateResourceGroup(request);}
public static RevFilter has(RevFlag a) {final RevFlagSet s = new RevFlagSet();s.add(a);return new HasAll(s);}
@Override public int size() {return totalSize;}
public void write(LittleEndianOutput out) {out.writeByte(sid + getPtgClass());out.writeShort(field_1_index_extern_sheet);out.writeInt(unused1);}
public String toString() {return this.getClass().getSimpleName() + "@" + directory + " lockFactory=" + lockFactory;}
public final ValueEval evaluate(ValueEval[] args, int srcRowIndex, int srcColumnIndex) {switch (args.length) {case 3:return evaluate(srcRowIndex, srcColumnIndex, args[0], args[1], args[2]);case 4:return evaluate(srcRowIndex, srcColumnIndex, args[0], args[1], args[2], args[3]);}return ErrorEval.VALUE_INVALID;}
public CancelDataRepositoryTaskResult cancelDataRepositoryTask(CancelDataRepositoryTaskRequest request) {request = beforeClientExecution(request);return executeCancelDataRepositoryTask(request);}
public DateFormatTokenizer(String format) {this.format = format;}
public static int getBiasedExponent(long rawBits) {return Math.toIntExact((rawBits & EXPONENT_MASK) >> EXPONENT_SHIFT);}
public String toString() {return "IB " + distribution.toString() + "-" + lambda.toString()+ normalization.toString();}
public String getName() {return name;}
public boolean inContext(String context) {return false;}
public String toString() {String desc;File directory = getDirectory();if (directory != null)desc = directory.getPath();elsedesc = getClass().getSimpleName() + "-" + System.identityHashCode(this);return "Repository[" + desc + "]"; }
public int serialize(int offset, byte [] data) {LittleEndian.putInt(data, offset+0, field_13_border_styles1);LittleEndian.putInt(data, offset+4, field_14_border_styles2);return 8;}
public void decode(byte[] blocks, int blocksOffset, long[] values, int valuesOffset, int iterations) {for (int j = 0; j < iterations; ++j) {final byte block = blocks[blocksOffset++];values[valuesOffset++] = (block >>> 7) & 1;values[valuesOffset++] = (block >>> 6) & 1;values[valuesOffset++] = (block >>> 5) & 1;values[valuesOffset++] = (block >>> 4) & 1;values[valuesOffset++] = (block >>> 3) & 1;values[valuesOffset++] = (block >>> 2) & 1;values[valuesOffset++] = (block >>> 1) & 1;values[valuesOffset++] = block & 1;}}
public PipedWriter(PipedReader destination) throws IOException {super(destination);connect(destination);}
public String dequote(byte[] in, int ip, int ie) {boolean inquote = false;final byte[] r = new byte[ie - ip];int rPtr = 0;while (ip < ie) {final byte b = in[ip++];switch (b) {case '\'':inquote = !inquote;continue;case '\\':if (inquote || ip == ie)r[rPtr++] = b; elser[rPtr++] = in[ip++];continue;default:r[rPtr++] = b;continue;}}return RawParseUtils.decode(UTF_8, r, 0, rPtr);}
public Status getStatus() {return myStatus;}
public DeltaRecord(RecordInputStream in) {field_1_max_change = in.readDouble();}
public void serialize(LittleEndianOutput out) {out.writeShort(getCount());}
public ListPartsRequest(String vaultName, String uploadId) {setVaultName(vaultName);setUploadId(uploadId);}
public void set(int index, long value) {final int o = index >>> 2;final int b = index & 3;final int shift = b << 4;blocks[o] = (blocks[o] & ~(65535L << shift)) | (value << shift);}
public void setRunInBackground(int deltaPri) {runInBackground = true;this.deltaPri = deltaPri;}
public TeeInputStream(InputStream src, OutputStream dst) {this.src = src;this.dst = dst;}
public void addChild(final Property property)throws IOException{String name = property.getName();if (_children_names.contains(name)){throw new IOException("Duplicate name \"" + name + "\"");}_children_names.add(name);_children.add(property);}
public ValueEval evaluate(int srcRowIndex, int srcColumnIndex, ValueEval arg0) {int result;if (arg0 instanceof TwoDEval) {result = ((TwoDEval) arg0).getWidth();} else if (arg0 instanceof RefEval) {result = 1;} else { return ErrorEval.VALUE_INVALID;}return new NumberEval(result);}
public ListModelsResult listModels(ListModelsRequest request) {request = beforeClientExecution(request);return executeListModels(request);}
public ExtensionQuery(QueryParser topLevelParser, String field, String rawQueryString) {this.field = field;this.rawQueryString = rawQueryString;this.topLevelParser = topLevelParser;}
public String toString() {return resourceDescription;}
public GetDeploymentInstanceResult getDeploymentInstance(GetDeploymentInstanceRequest request) {request = beforeClientExecution(request);return executeGetDeploymentInstance(request);}
public MappingCharFilterFactory(Map<String,String> args) {super(args);mapping = get(args, "mapping");if (!args.isEmpty()) {throw new IllegalArgumentException("Unknown parameters: " + args);}}
public boolean promptPassphrase(String msg) {CredentialItem.StringType v = newPrompt(msg);if (provider.get(uri, v)) {passphrase = v.getValue();return true;}passphrase = null;return false;}
public DescribeReservedDBInstancesResult describeReservedDBInstances() {return describeReservedDBInstances(new DescribeReservedDBInstancesRequest());}
public UnsubscribeFromDatasetResult unsubscribeFromDataset(UnsubscribeFromDatasetRequest request) {request = beforeClientExecution(request);return executeUnsubscribeFromDataset(request);}
public int available() throws IOException {if (buf == null) {throw new IOException();}return buf.length - pos + in.available();}
@Override public V remove(Object key) {return isInBounds(key) ? TreeMap.this.remove(key) : null;}
public void insertSST() {LOG.log(DEBUG, "creating new SST via insertSST!");sst = new SSTRecord();records.add(records.size() - 1, createExtendedSST());records.add(records.size() - 2, sst);}
public AddApplicationCloudWatchLoggingOptionResult addApplicationCloudWatchLoggingOption(AddApplicationCloudWatchLoggingOptionRequest request) {request = beforeClientExecution(request);return executeAddApplicationCloudWatchLoggingOption(request);}
public ListCampaignsResult listCampaigns(ListCampaignsRequest request) {request = beforeClientExecution(request);return executeListCampaigns(request);}
public void execute(Lexer lexer) {lexer.more();}
public SetFaceCoverRequest() {super("CloudPhoto", "2017-07-11", "SetFaceCover", "cloudphoto");setProtocol(ProtocolType.HTTPS);}
public GetInstanceAccessResult getInstanceAccess(GetInstanceAccessRequest request) {request = beforeClientExecution(request);return executeGetInstanceAccess(request);}
public void clear() {value = null;}
public GetFederationTokenResult getFederationToken(GetFederationTokenRequest request) {request = beforeClientExecution(request);return executeGetFederationToken(request);}
public int first() {currentSentence = 0;text.setIndex(text.getBeginIndex());return current();}
public QueryPhraseMap getFieldTermMap( String fieldName, String term ){QueryPhraseMap rootMap = getRootMap( fieldName );return rootMap == null ? null : rootMap.subMap.get( term );}
@Override public boolean contains(Object object) {if (object instanceof Multiset.Entry) {Multiset.Entry<?> entry = (Multiset.Entry<?>) object;Object element = entry.getElement();int entryCount = entry.getCount();return entryCount > 0 && count(element) == entryCount;}return false;}
public DeleteLexiconResult deleteLexicon(DeleteLexiconRequest request) {request = beforeClientExecution(request);return executeDeleteLexicon(request);}
public DomainMetadataResult domainMetadata(DomainMetadataRequest request) {request = beforeClientExecution(request);return executeDomainMetadata(request);}
public RevFlag getReinterestingFlag() {return REINTERESTING;}
public static void advise(FileDescriptor fd, long offset, long len, int advise) throws IOException {final int code = posix_fadvise(fd, offset, len, advise);if (code != 0) {throw new RuntimeException("posix_fadvise failed code=" + code);}}
public DeleteSchemaResult deleteSchema(DeleteSchemaRequest request) {request = beforeClientExecution(request);return executeDeleteSchema(request);}
public CreateBatchInferenceJobResult createBatchInferenceJob(CreateBatchInferenceJobRequest request) {request = beforeClientExecution(request);return executeCreateBatchInferenceJob(request);}
public BitField(final int mask){_mask = mask;int count       = 0;int bit_pattern = mask;if (bit_pattern != 0){while ((bit_pattern & 1) == 0){count++;bit_pattern >>= 1;}}_shift_count = count;}
public boolean failed() {return !failingPaths.isEmpty();}
public String toString() {StringBuilder b = new StringBuilder();for(int i=0;i<len;i++) {if (i > 0) {b.append(' ');}b.append(Integer.toBinaryString(bytes[i].value));}return b.toString();}
public final void remove() {if (modCount != expectedModCount)throw new ConcurrentModificationException();if (lastReturned == null)throw new IllegalStateException();LinkedHashMap.this.remove(lastReturned.key);lastReturned = null;expectedModCount = modCount;}
public boolean shouldBeRecursive() {return path.shouldBeRecursive() || ANY_DIFF.shouldBeRecursive();}
public DeleteQueueRequest(String queueUrl) {setQueueUrl(queueUrl);}
public ExternalName getExternalName(int externSheetIndex, int externNameIndex) {String nameName = linkTable.resolveNameXText(externSheetIndex, externNameIndex, this);if(nameName == null) {return null;}int ix = linkTable.resolveNameXIx(externSheetIndex, externNameIndex);return new ExternalName(nameName, externNameIndex, ix);}
public RegisterUserResult registerUser(RegisterUserRequest request) {request = beforeClientExecution(request);return executeRegisterUser(request);}
public void decode(byte[] blocks, int blocksOffset, int[] values, int valuesOffset, int iterations) {for (int j = 0; j < iterations; ++j) {values[valuesOffset++] = blocks[blocksOffset++] & 0xFF;}}
public ValueEval evaluate(int srcRowIndex, int srcColumnIndex, ValueEval arg0) {return fixed(arg0, new NumberEval(2), BoolEval.FALSE, srcRowIndex, srcColumnIndex);}
public final byte[] array() {return protectedArray();}
public int readUByte() {byte[] buf = new byte[1];try {checkEOF(read(buf), 1);} catch (IOException e) {throw new RuntimeException(e);}return LittleEndian.getUByte(buf);}
public static AttrPtg createSkip(int dist) {return new AttrPtg(optiSkip.set(0), dist, null, -1);}
public DescribeUserHierarchyGroupResult describeUserHierarchyGroup(DescribeUserHierarchyGroupRequest request) {request = beforeClientExecution(request);return executeDescribeUserHierarchyGroup(request);}
public User(String path, String userName, String userId, String arn, java.util.Date createDate) {setPath(path);setUserName(userName);setUserId(userId);setArn(arn);setCreateDate(createDate);}
public OpenNLPLemmatizerFilter create(TokenStream in) {try {NLPLemmatizerOp lemmatizerOp = OpenNLPOpsFactory.getLemmatizer(dictionaryFile, lemmatizerModelFile);return new OpenNLPLemmatizerFilter(in, lemmatizerOp);} catch (IOException e) {throw new RuntimeException(e);}}
public void decode(byte[] blocks, int blocksOffset, long[] values, int valuesOffset, int iterations) {for (int i = 0; i < iterations; ++i) {final long byte0 = blocks[blocksOffset++] & 0xFF;final long byte1 = blocks[blocksOffset++] & 0xFF;values[valuesOffset++] = (byte0 << 4) | (byte1 >>> 4);final long byte2 = blocks[blocksOffset++] & 0xFF;values[valuesOffset++] = ((byte1 & 15) << 8) | byte2;}}
public RebootInstanceRequest() {super("HPC", "2016-06-03", "RebootInstance", "hpc");setMethod(MethodType.POST);}
public ListContainerInstancesResult listContainerInstances(ListContainerInstancesRequest request) {request = beforeClientExecution(request);return executeListContainerInstances(request);}
public ListClustersResult listClusters(ListClustersRequest request) {request = beforeClientExecution(request);return executeListClusters(request);}
public static boolean equals(boolean[] array1, boolean[] array2) {if (array1 == array2) {return true;}if (array1 == null || array2 == null || array1.length != array2.length) {return false;}for (int i = 0; i < array1.length; i++) {if (array1[i] != array2[i]) {return false;}}return true;}
